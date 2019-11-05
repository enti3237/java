package p616;

public class PThread2 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("Ω««‡¡ﬂ");
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("END!");
	}
}
