package p242;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed+ " km/h���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.speed = 10;
		mycar.run();
	
}

}
