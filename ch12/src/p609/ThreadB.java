package p609;

public class ThreadB extends Thread {

	private WorkObj wo;

	public ThreadB(WorkObj wo) {
		this.wo = wo;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				wo.methodB();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
