package p317;

import p315.Car;
import p315.HankookTire;
import p316.KumhoTire;

public class CarExam {
	
	public static void main(String[] args) {
		Car car = new Car();		//Car(315p) ��ü ����
		
		for(int i=0 ; i<=5; i++) {	//Car ��ü�� run() �޼ҵ� 5ȸ �ݺ�
			int problemLocarion = car.run();
			
			switch(problemLocarion) {
			case 1:
				System.out.println("�տ��� Ÿ�̾ �ѱ�Ÿ�̾�� ��ü");
				car.flTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� Ÿ�̾ ��ȣŸ�̾�� ��ü");
				car.frTire = new KumhoTire("�տ�����", 15);
				break;
			case 3:
				System.out.println("�ڿ��� Ÿ�̾ �ѱ�Ÿ�̾�� ��ü");
				car.blTire = new HankookTire("�ڿ���", 15);
				break;
			case 4:
				System.out.println("�ڿ����� Ÿ�̾ ��ȣŸ�̾�� ��ü");
				car.brTire = new KumhoTire("�ڿ�����", 15);
				break;
			}
			
			System.out.println("--------------------------------");
			
		}
	}
}
