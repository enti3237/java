package p248;

import p267.Car;

public class CarExam {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		//�߸��� �ӵ�����
		mycar.setSpeed(50);
		System.out.println("���� �ӵ� : " +mycar.getSpeed());
		
		//�ùٸ� �ӵ�����
		mycar.setSpeed(100);
		
		//����
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : " +mycar.getSpeed());
	}

}
