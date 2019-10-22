package p315;

import p314.Tire;

public class Car {
	//필드
	public Tire flTire = new Tire("앞왼쪽", 6);
	public Tire frTire = new Tire("앞오른쪽", 2);
	public Tire blTire = new Tire("뒤왼쪽", 3);
	public Tire brTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	//메소드
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(flTire.roll()==false) {stop(); return 1;}
		if(frTire.roll()==false) {stop(); return 2;}
		if(blTire.roll()==false) {stop(); return 3;}
		if(brTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	//모든 타이어를 1회전 시키기 위해 Tire객체의 roll메소드를 호출한다. false를 리턴하는 roll이 있을 경우는 stop메소드를 호출하고 "해당 타이어 번호를 리턴"한다.
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
