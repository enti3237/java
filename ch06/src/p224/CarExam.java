package p224;

import p223.Car;

public class CarExam {
	public static void main(String[] args) {
		
		Car mycar = new Car();

		mycar.setGas(5); //Car�� setGas �޼ҵ� ȣ��(��Ʈ��)
		
		boolean gasState = mycar.isLeftGas(); //Car�� isLeftCas �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			mycar.run(); //Car�� run�޼ҵ� ȣ��
		}
		
		if(mycar.isLeftGas()) { //Car�� isLeftGas �޼ҵ� ȣ��
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}
	}

}
