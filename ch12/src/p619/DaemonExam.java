package p619;

public class DaemonExam {
	public static void main(String[] args) throws Exception {

		AutoSaveThread auto = new AutoSaveThread();
		auto.setDaemon(true);
		auto.start();

		Thread.sleep(3000);

		System.out.println("메인스레드 종료");
	}
}