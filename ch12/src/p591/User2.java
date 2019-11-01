package p591;

public class User2 extends Thread {
	private Calc calc;

	public void setCalc(Calc calc) {
		this.setName("User2");
		this.calc = calc;
	}

	@Override
	public void run() {
		try {
			calc.setMemory(50); // Calc의 메모리에 50을 저장함
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
