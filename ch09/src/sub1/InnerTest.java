package sub1;
/*
 * ��¥ : 2019-10-22
 * �̸� : ������
 * ���� : ��ø Ŭ���� �ǽ��ϱ� ���� p.390
 */

import sub1.Outer.Inner;
//��ø Ŭ���� �� ����Ʈ�� �ʿ��ϴ�

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(1);
		inn.info();
		
	}
}