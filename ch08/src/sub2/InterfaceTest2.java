package sub2;
/* 
 * ��¥ : 2019-10-22
 * �̸� : ������
 * ���� : �������̽� �ǽ��ϱ� ���� p.344
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		
		//�������̽� �ǽ� 2 - ���� ����� ���� (���� ���迡���� ������ �κ�)
		//�������̶��ð� TV�� Computer�� �տ� ���� �� ���� ������) TV�� ���ð� ���ͳ��� �ȵǰ� ���̸� �Ŀ��¿����� �ȵ�
		
		//TV�� �θ�� �ϰ� Computer�� �������̽� ���� (���߻��) SmartTV�� ���� ��üȭ�ؼ� ��� ��
		
		SmartTV stv = new SmartTV();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
		
	}

}
