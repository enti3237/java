package p227;

public class Calc {
	private int plus(int x, int y) {
		int rs = x + y;
		return rs;
	}
	
	private double avg(int x, int y) {
		double sum = plus(x, y);
		double rs = sum / 2;
		return rs;
	}
	
	public void execute() {
		double rs = avg(7,10);
		println("������ : " +rs);
	}
	
	public void println(String message) {
		System.out.println(message);
	}
}
