package sub5;
/*
 * ��¥ : 2019-10-21
 * �̸� : ������
 * ���� : ĳ���� �ǽ��ϱ� p.324
 */

import sub4.Animal;
import sub4.Eagle;
import sub4.Tiger;

public class Casting {
	public static void main(String[] args) {
		
		int    num1 = 1;
		double num2 = num1;
		
		double var1 = 1.23;
		//ĳ���� - Ÿ�Ժ�ȯ
		int    var2 = (int)var1;
		
		System.out.println(num2);
		System.out.println(var2);
		
		//��ĳ����(������ ����)
//		Tiger t = new Tiger();
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		
		//�ٿ�ĳ���� (������ ����Ÿ������ �ǵ��� �� - ����Ÿ�� �����ؾ���)
		Tiger t = (Tiger)a1;
		Eagle e = (Eagle)a2;
		
		t.move();
		e.move();
		a1.move();
		a2.move();
	}
}
