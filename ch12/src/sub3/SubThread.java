package sub3;

public class SubThread extends Add implements Runnable {

	// 다중상속()을 하고 싶을 때 Thread를 extends 하지 못하면 인터페이스로 상속한다

	private int start;
	private int end;

	public SubThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int k = start; k <= end; k++) {
			setNum(k);
		}
	}
}
