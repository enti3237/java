package p314;

public class Tire {
	
	//�ʵ�
	public int maxRotation;				//�ִ�ȸ����(Ÿ�̾����)
	public int accumulatedRotation;		//����ȸ����
	public String location;				//Ÿ�̾��� ��ġ

	//������
	public Tire (String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;			//����ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "Tire ����" +(maxRotation-accumulatedRotation)+ "ȸ");
			return true;				//����ȸ��(����ȸ����<�ִ�ȸ����)
		} else {
			System.out.println("***" + location + "Tire ��ũ  ***");
			return false;				//��ũ(����>�ִ�)
		}
	}
	
}