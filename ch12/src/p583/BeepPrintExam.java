package p583;

public class BeepPrintExam {

	public static void main(String[] args) throws Exception {
	
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("¶¥");
			Thread.sleep(500);
		}
	}
}
