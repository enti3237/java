package sub3;
/*
 * ��¥:2019-10-21
 * �̸�:������
 * ����:�������̵� �޼��� �ǽ�
 */
public class OverrideTest {
	public static void main(String[] args) {
		BBB b = new BBB();
		// CCC c = new CCC();

		//�θ��� �޼���� �ڽ��� �޼��尡 �������� ������ �����ϸ� �ڽ� �޼��尡 ���� ������� (������=override)
		b.method2();
//		c.method1();
//		c.method2();
		//int a�� method2�� �����ε� �޼ҵ� (���� ������ ���������� �ٸ��� �ؼ� ����)
//		c.method2(1);
//		c.method3();
		
		//final �ǽ� (������ ���ȭ �Ѵ�. �� ��� ���� �빮�ڷ� �����ϴ� ������ ����)
		// - final ����    : ���ȭ 
		// - final �޼ҵ� : �������̵� ����
		// - final Ŭ���� : ��� ����
		
		final int    NUM = 1;
		final double PI  = 3.14;
		// num = 2; // �̷��� �� �ٲ�
		
		System.out.println(NUM);
		System.out.println(PI);

	}
}
