package p315;

import p314.Tire;

public class Car {
	//�ʵ�
	public Tire flTire = new Tire("�տ���", 6);
	public Tire frTire = new Tire("�տ�����", 2);
	public Tire blTire = new Tire("�ڿ���", 3);
	public Tire brTire = new Tire("�ڿ�����", 4);
	
	//������
	//�޼ҵ�
	public int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(flTire.roll()==false) {stop(); return 1;}
		if(frTire.roll()==false) {stop(); return 2;}
		if(blTire.roll()==false) {stop(); return 3;}
		if(brTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	//��� Ÿ�̾ 1ȸ�� ��Ű�� ���� Tire��ü�� roll�޼ҵ带 ȣ���Ѵ�. false�� �����ϴ� roll�� ���� ���� stop�޼ҵ带 ȣ���ϰ� "�ش� Ÿ�̾� ��ȣ�� ����"�Ѵ�.
	
	public void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
