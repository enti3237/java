package p582;

public class BeepPrintExam {
	public static void main(String[] args) throws Exception {

		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			Thread.sleep(450);
		}
	}
}
// �ٵ� �̷��� ������µǾ �������� sleep�� ��ġ�� �ɷ� ��� �� �� �ƴϰ���
