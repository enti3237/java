package p213;

public class CarExam {
	public static void main(String[] args) {

	Car car1 = new Car();
	System.out.println("company : " +car1.company);
	System.out.println();
	
	Car car2 = new Car("자가용");
	System.out.println("Company : " +car2.company);
	System.out.println("Model   : " +car2.model);
	System.out.println();
	
	Car car3 = new Car("자가용", "빨강");
	System.out.println("Company : " +car3.company);
	System.out.println("Model   : " +car3.model);
	System.out.println("Color   : " +car3.color);
	System.out.println();
			
	Car car4 = new Car("택시", "검정", 200);
	System.out.println("Company : " +car4.company);
	System.out.println("Model   : " +car4.model);
	System.out.println("Color   : " +car4.color);
	System.out.println("maxSpeed: " +car4.maxSpeed);
	}
}
