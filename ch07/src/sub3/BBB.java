package sub3;

//Ŭ�������� final ���� ����. ��� �Ұ�������
//���� �̷� ���� ���� ����
public final class BBB extends AAA {
	
	//AAA�� 1�� �����
	@Override
	public void method1() {
		System.out.println("BBB - method1()...");
	}
	
	//Overload (��� �����ε�� @�� �� ����)
	public void method2(int a) {
		System.out.println("BBB - method2()...");
	}

	//AAA�� 3�� �����
	@Override
	public final void method3() {
		//final�� ������ ��� �������̵� ���� (CCC�� ������ ��)
		System.out.println("BBB - method3()...");
	}
}