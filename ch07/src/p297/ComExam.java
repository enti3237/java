package p297;

import p296.Calc;

public class ComExam {
	public static void main(String[] args) {
		int r = 10;
		
		Calc calc = new Calc();
		System.out.println("원면적 : " +calc.areaCircle(r));
		System.out.println();
		
		Com com = new Com();
		System.out.println("원면적: " +com.areaCircle(r));
	}
}
