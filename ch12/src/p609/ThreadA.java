package p609;

public class ThreadA extends Thread {

	private WorkObj wo;
	
	public ThreadA(WorkObj wo) {
		this.wo = wo;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			wo.methodA();
		}
	}
}
