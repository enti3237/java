package p315;

import p314.Tire;

public class HankookTire extends Tire {

	//�ʵ� - ����
	
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);		//Ÿ�̾��� �װ�
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;			//����ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "HankookTire ����" +(maxRotation-accumulatedRotation)+ "ȸ");
			return true;				//����ȸ��(����ȸ����<�ִ�ȸ����)
		} else {
			System.out.println("***" + location + "HankookTire ��ũ  ***");
			return false;				//��ũ(����>�ִ�)
		}
	}
}
