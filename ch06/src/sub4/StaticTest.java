package sub4;
/*
 * ��¥ : 2019-10-17
 * �̸� : ������
 * ���� : ��������, �����޼��� �ǽ��ϱ�
 */
public class StaticTest {
	public static void main(String[] args) {

		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		//��������(Ŭ��������)�� �̹� �����Ҵ翵��(method area)�� �����Ǿ� �ֱ� ������
		//��ü���� ���� �ٷ� ������ �� �ִ�.
		//���� public�̶� ������ ��
		
		Increment.num2 = 10 ;
		/* Increment.num1 = 10 ; �̰� �ȵ� */
		Increment.add();
		
		System.out.println(Increment.num2);
		
		//������ü ������
		Calc c = Calc.getInstance();
		
		int rs1 = c.plus(1,2);
		int rs2 = c.minus(1,2);
		int rs3 = c.multi(3,2);
		int rs4 = c.div(4,2);
		
		System.out.println("rs1 : " +rs1);
		System.out.println("rs2 : " +rs2);
		System.out.println("rs3 : " +rs3);
		System.out.println("rs4 : " +rs4);
	}
}
