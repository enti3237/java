package p591;

public class User1 extends Thread {
	private Calc calc;

	// 공유객체인 Calc를 필드에 저장함
	public void setCalc(Calc calc) {
		this.setName("User1");
		this.calc = calc;
	}

	@Override
	public void run() {
		try {
			calc.setMemory(100); // Calc의 메모리에 100을 저장함
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
