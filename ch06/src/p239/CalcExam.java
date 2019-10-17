package p239;

import p238.Calc;
//임포트 말고도 라이브러리에 전부 퍼블릭이 붙어있어야 먹힘

public class CalcExam {
	public static void main(String[] args) {
		
		double rs1 = 10 * 10 * Calc.pi;
		int rs2 = Calc.plus(10,5);
		int rs3 = Calc.minus(10,5);
		
		System.out.println("rs1 = " +rs1);
		System.out.println("rs2 = " +rs2);
		System.out.println("rs3 = " +rs3);
	}

}
