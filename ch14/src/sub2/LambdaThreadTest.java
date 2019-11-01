package sub2;

/*
 * 날짜 : 2019-10-28
 * 이름 : 이지영
 * 내용 : 람다식 실습하기
 */
public class LambdaThreadTest {

	public static void main(String[] args) throws Exception {

		Runnable r = () -> {

			for (int i = 1; i <= 10; i++) {
				// 메인쓰레드에서 throws를 먹여줘도 여기는 영역이 달라서 try-catch를 써줘야 함
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("서브쓰레드 실행...");
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println("메인쓰레드 실행!");
		}

		System.out.println("프로그램 종료");

	}

}
