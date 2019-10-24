package p323;
import p322.Vehicle;

public class DriverExam {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle Vehicle = new Vehicle();
		
		driver.drive(Vehicle);
		driver.drive(bus);
		driver.drive(taxi);
	}

}
