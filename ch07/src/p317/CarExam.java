package p317;

import p315.Car;
import p315.HankookTire;
import p316.KumhoTire;

public class CarExam {
	
	public static void main(String[] args) {
		Car car = new Car();		//Car(315p) 객체 생성
		
		for(int i=0 ; i<=5; i++) {	//Car 객체의 run() 메소드 5회 반복
			int problemLocarion = car.run();
			
			switch(problemLocarion) {
			case 1:
				System.out.println("앞왼쪽 타이어를 한국타이어로 교체");
				car.flTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 타이어를 금호타이어로 교체");
				car.frTire = new KumhoTire("앞오른쪽", 15);
				break;
			case 3:
				System.out.println("뒤왼쪽 타이어를 한국타이어로 교체");
				car.blTire = new HankookTire("뒤왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤오른쪽 타이어를 금호타이어로 교체");
				car.brTire = new KumhoTire("뒤오른쪽", 15);
				break;
			}
			
			System.out.println("--------------------------------");
			
		}
	}
}
