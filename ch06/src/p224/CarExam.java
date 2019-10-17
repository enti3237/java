package p224;

import p223.Car;

public class CarExam {
	public static void main(String[] args) {
		
		Car mycar = new Car();

		mycar.setGas(5); //Car의 setGas 메소드 호출(인트값)
		
		boolean gasState = mycar.isLeftGas(); //Car의 isLeftCas 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			mycar.run(); //Car의 run메소드 호출
		}
		
		if(mycar.isLeftGas()) { //Car의 isLeftGas 메소드 호출
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}
	}

}
