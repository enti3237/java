package p583;

public class BeepThread extends Thread {

	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("ºñÇÁ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
