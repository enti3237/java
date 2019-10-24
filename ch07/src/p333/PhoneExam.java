package p333;

public class PhoneExam {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		//Phone는 추상클래스라 신규객체를 생성할 수 없다
		
		Smartphone sphone = new Smartphone("홍길동");
		
		sphone.turnOn();
		sphone.internet();
		sphone.turnOff();
	}
}