package p210;

public class CarExam {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("company : " +car1.company);
		System.out.println();
		
		Car car2 = new Car("�ڰ���");
		System.out.println("company : " +car2.company);
		System.out.println("model : " +car2.model);
		System.out.println();
		
		Car car3 = new Car("�ڰ���", "����");
		System.out.println("company : " +car3.company);
		System.out.println("model : " +car3.model);
		System.out.println("color : " +car3.color);
		System.out.println();
		
		Car car4 = new Car("�ý�", "����", 200);
		System.out.println("company : " +car4.company);
		System.out.println("model : " +car4.model);
		System.out.println("color : " +car4.color);
		System.out.println("maxSpeed : " +car4.maxSpeed);
		System.out.println();
	}
}
