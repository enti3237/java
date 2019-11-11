package p490;


public class CalssExam {
	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		
		try {
			Class clazz2 = Class.forName("¤·¤µ¤·");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
