package p333;

import p332.Phone;

public class Smartphone extends Phone {
	//생성자
	public Smartphone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internet() {
		System.out.println("인터넷을 한다");
	}
}
