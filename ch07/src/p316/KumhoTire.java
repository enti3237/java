package p316;

import p314.Tire;

public class KumhoTire extends Tire {
	
	//�ʵ�
	
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;			//����ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "KumhoTire ����" +(maxRotation-accumulatedRotation)+ "ȸ");
			return true;				//����ȸ��(����ȸ����<�ִ�ȸ����)
		} else {
			System.out.println("***" + location + "KumhoTire ��ũ  ***");
			return false;				//��ũ(����>�ִ�)
		}
	}
}
