package sub1;
/*
 * 날짜 : 2019-10-28
 * 이름 : 이지영
 * 내용 : 스레드Thread 실습하기 교재 p576
 */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		// try-catch와 거의 동일한 예외처리 throws

		SubThread sub1 = new SubThread("서브1");
		SubThread sub2 = new SubThread("서브2");

		// 비동기방식으로 실행
		sub1.start();
		sub2.start();

//		sub1.run();
//		sub2.run();

		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println("메인쓰레드 실행...");
		}
		System.out.println("메인 종료...");
	}

}
