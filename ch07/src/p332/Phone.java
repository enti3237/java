package p332;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메서드
	public void turnOn() {
		System.out.println("폰을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰을 끕니다.");
	}
	
	

}
