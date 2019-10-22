package p319;

import p314.Tire;

public class Car {
	//필드
	public Tire[] tires = {
			new Tire("FL", 6),
			new Tire("FR", 2),
			new Tire("BL", 3),
			new Tire("BR", 4)};
	
	//메소드
	public int run() {
		System.out.println("자동차가 달립니다.");
		for (int i=0 ; i<tires.length ; i++) {
			if(tires[i].roll()==false) {
				stop();
				return(i+1);
			}
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
