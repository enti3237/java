package p211;

import p210.Car;
//패키지가 다른 객체를 참조하려면 이게 필요한데 직접 치지 말고 Car쓰고 컨트롤+스페이스
//라이브러리 파일에 전부 public이 붙어있어야 이게 먹힌다

public class CarExam {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("company : " +car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("company : " +car2.company);
		System.out.println("model : " +car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("company : " +car3.company);
		System.out.println("model : " +car3.model);
		System.out.println("color : " +car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("company : " +car4.company);
		System.out.println("model : " +car4.model);
		System.out.println("color : " +car4.color);
		System.out.println("maxSpeed : " +car4.maxSpeed);
		System.out.println();
	}
}
