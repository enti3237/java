package sub3;
/* 
 * ��¥ : 2019-10-22
 * �̸� : ������
 * ���� : �������̽� �ǽ��ϱ� ���� p.344
 */
public class InterfaceTest3 {

	public static void main(String[] args) {
		
		//�������̽� �ǽ� 3 - ��ü���� ���յ��� ��ȭ
		
		Bulb bulb = new Bulb();
		//Cable cable = new Cable(bulb);
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();

	}

}
