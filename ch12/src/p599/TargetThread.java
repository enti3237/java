package p599;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) { // 10억번 루핑 돌리기
		}

		try {
			Thread.sleep(500); 				// 1.5초간 재움
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (long i = 0; i < 1000000000; i++) {	// 다시 1억번 루핑
		}
	}
}
