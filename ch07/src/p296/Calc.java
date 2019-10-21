package p296;

public class Calc {

	//ComExam은 자식객체가 아니므로 여기 protected를 쓰면 못 읽는다 ㅇ_ㅇ;
	public double areaCircle(double r) {
		System.out.println("Calc 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
