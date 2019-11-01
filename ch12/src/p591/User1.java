package p591;

public class User1 extends Thread {
	private Calc calc;

	// ������ü�� Calc�� �ʵ忡 ������
	public void setCalc(Calc calc) {
		this.setName("User1");
		this.calc = calc;
	}

	@Override
	public void run() {
		try {
			calc.setMemory(100); // Calc�� �޸𸮿� 100�� ������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
