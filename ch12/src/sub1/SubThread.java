package sub1;

public class SubThread extends Thread {

	private String name;

	public SubThread(String name) {
		this.name = name;
	}

	@Override
	// run을 재정의
	// override 메소드 자체에 throws 적용 불가. 적용하면 다른 메소드가 된다 그러므로 그냥 try-catch 사용
	public void run() {

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "쓰레드 실행...");
		}

		System.out.println(name + "종료...");

	}

}