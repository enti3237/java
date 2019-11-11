package p624;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup thGp, String thNm) {
		super(thGp, thNm);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " Á¾·áµÊ");
	}
}
