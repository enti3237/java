package sub1;
/*
 * ��¥ : 2019-10-23
 * �̸� : ������
 * ���� : �ڹ� ����Ŭ���� object �ǽ��ϱ� ���� p.457
 */

public class ObjectTest {
	public static void main(String[] args) {

		Apple a1 = new Apple("�ѱ�", 2000);
		Apple a2 = new Apple("�Ϻ�", 1000);
		Banana b1 = new Banana("�븸", 2500);
		Banana b2 = new Banana("����", 3500);
		
		//Object�� �ڹ� ��� Ŭ������ �ֻ����� �������� Ȱ�� ����
		Object fruit[] = {a1, a2, b1, b2};
		
		//�ٿ�ĳ����
		Apple f1  = (Apple) fruit[0];
		Banana f3 = (Banana) fruit[2];
		
		f1.info();
		f3.info();
	}

}
