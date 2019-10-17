package p218;

import p217.Cal;

public class CalExam {
	public static void main(String[] args) {
		
		Cal myCal = new Cal();
		myCal.powerOn();
		
		int rs1 = myCal.plus(5, 6);
		System.out.println("rs1 : "+rs1);
		
		byte x = 10;
		byte y =  4;
		double rs2 = myCal.divide(x, y);
		System.out.println("rs2 : "+rs2);

		myCal.powerOff();
	}

}
