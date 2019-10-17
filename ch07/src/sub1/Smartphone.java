package sub1;

public class Smartphone extends Computer {

	//필드
	private String brand;
	private String tel;
	private int price;
	
	//생성자
	public Smartphone(
			String cpu, 
			String ram, 
			String hdd, 
			String brand, 
			String tel, 
			int price) {
		super(cpu, ram, hdd);
		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}
	
	
	//개능
	public void call() {
		System.out.println(tel+ " 번호로 전화 거는 중...");
	}
	public void info() {
		/* super.info(); */
		/* protected로 지정한 변수는 자식클래스가 맘대로 참조 가능 */
		System.out.println("CPU : " + cpu);
		System.out.println("제품명  : " +brand);
		System.out.println("폰번호  : " +tel);
		System.out.println("제품가격: " +price);
	}
	
}
