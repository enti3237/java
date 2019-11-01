package p582;

public class BeepPrintExam {
	public static void main(String[] args) throws Exception {

		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("땅");
			Thread.sleep(450);
		}
	}
}
// 근데 이렇게 랜덤출력되어도 괜찮은가 sleep을 고치는 걸로 어떻게 될 게 아니겠지
