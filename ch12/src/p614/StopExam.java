package p614;

import p615.PThread1;

public class StopExam {
	public static void main(String[] args) throws Exception {
		
		PThread1 pt = new PThread1();
		pt.start();
		
		Thread.sleep(1000);
		
		pt.setStop(true);
	}
}