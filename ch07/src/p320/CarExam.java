package p320;

import java.time.LocalDate;

import p315.HankookTire;
import p319.Car;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0 ; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation !=0) {
				System.out.println(car.tires[problemLocation-1].location + "한국타이어로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("=========================");			
		}
	}
}
