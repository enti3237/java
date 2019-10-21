package p297;
import p296.Calc;

public class Com extends Calc {

	//여기 protected를 쓰면 못 읽는다 ㅇ_ㅇ;
	public double areaCircle(double r) {
		System.out.println("Com 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
