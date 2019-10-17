package sub1;
/*
 * ��¥ : 2019-10-15
 * �̸� : ������
 * ���� : �޼��� Ÿ�� �ǽ��ϱ�
 */
public class MethodTypeTest {
	public static void main(String[] args) {

		int rs1 = type1(2,4);
		System.out.println("rs1 :" +rs1);

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		type2(arr); //type2�� ���ϰ��� �����Ƿ� ��½��� ������ �ȵ�
		
		double rs2 = type3() *5 *5;
		System.out.println("�������� 5�� ���� ���� :" +rs2);
		
		type4();
		
		//������ �Լ� ����
		gugudan(2);
		gugudan(5);
		gugudan(7);
	}
	
	// ������ �Լ� ���� (�Ű����� ���� ���� ���� : ������ �־ ������ ������ ���°ű�...)
	public static void gugudan(int n) {
		System.out.println(n+ "��");
		for(int i=2 ; i<=9 ; i++) {
			System.out.println(n+ "X" +i+ "=" +n*i);
		}
	}
	
	// Ÿ��1 - �Ű����� O / ���� O �� ��ȣ �ȿ� ���� ������ �ؾ��� �� ������ ������ ���� Ÿ���� void ��� ����
	public static int type1(int a, int b) {
		int c = a + b;
		return c;
	}

	// Ÿ��2 - �Ű����� O / ���� X �� ��ȣ �ȿ� ���� ������ �ؾ��� �� ������ �����Ƿ� void�� �״�� 
	public static void type2(int[] score) {
		int sum = 0;
		for(int s : score ) {
			sum += s;
		}
		System.out.println("�迭�� �� : "+sum);
	}
	
	// Ÿ��3 - �Ű����� X / ���� O �� ���� ���� ���� �� ���ϰ��� ���� void�� ������
	public static double type3() {
		return 3.14;
	}
	
	// Ÿ��4 - �Ű����� X / ���� X �� ���� ���� ���� �� ������ �����Ƿ� void�� �״�� 
	public static void type4() {
		int result = type1(3, 7);
		System.out.println("type4�� result :" +result);
	}
}