package p229;

public class CarExam {
	public static void main(String[] args) {

		Car mycar = new Car();
		
		mycar.keyTurnOn();
		mycar.run();
		int speed = mycar.getSpeed();
		System.out.println("����ӵ� : " +speed+ "km/h");

	}

}
