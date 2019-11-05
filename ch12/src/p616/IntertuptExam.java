package p616;

public class IntertuptExam {
	public static void main(String[] args) throws Exception {
		
		Thread td = new PThread2();
		td.start();
		
		Thread.sleep(1000);
		
		td.interrupt();
	}
}
