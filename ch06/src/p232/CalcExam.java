package p232;

public class CalcExam {
	public static void main(String[] args) {
		Calc mycalc = new Calc();
		
		//정사각형의 넓이 구하기
		double rs1 = mycalc.areaRec(10);
		
		//직사각형의 넓이 구하기
		double rs2 = mycalc.areaRec(10,20);
		
		//결과출력
		System.out.println("정사각형의 넓이 = "+rs1);
		System.out.println("직사각형의 넓이 = "+rs2);
	}

}
