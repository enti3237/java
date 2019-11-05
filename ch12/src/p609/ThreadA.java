package p609;

public class ThreadA extends Thread {

	private WorkObj wo;

	public ThreadA(WorkObj wo) {
		this.wo = wo;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				wo.methodA();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}