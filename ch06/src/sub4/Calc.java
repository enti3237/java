package sub4;

public class Calc {

	//생성자를 프라이빗으로 지정하면 외부에서 객체 임의 생성 불가
	//객체가 딱 하나만 있어야 하는 경우의 지정 (싱글톤 객체)
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}

	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	public int div(int x, int y) {
		int z = x / y;
		return z;
	}
}
