package p616;

public class PThread2 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("������");
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("END!");
	}
}
