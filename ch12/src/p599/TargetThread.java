package p599;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) { // 10��� ���� ������
		}

		try {
			Thread.sleep(500); 				// 1.5�ʰ� ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (long i = 0; i < 1000000000; i++) {	// �ٽ� 1��� ����
		}
	}
}
