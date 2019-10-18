package p248;

import p267.Car;

public class CarExam {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		//잘못된 속도변경
		mycar.setSpeed(50);
		System.out.println("현재 속도 : " +mycar.getSpeed());
		
		//올바른 속도변경
		mycar.setSpeed(100);
		
		//멈춤
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		System.out.println("현재 속도 : " +mycar.getSpeed());
	}

}
