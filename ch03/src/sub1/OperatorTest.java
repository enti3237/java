package sub1;

/*
 * ��¥ : 2019-10-11
 * �̸� : ������
 * ���� : ������ �ǽ��ϱ� ���� p64
 */

public class OperatorTest {
	public static void main(String[] args) {
		//��������� : ����Ÿ�Լ����� byte, short, int, long�� ������ �� int
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;

		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num4;
		int rs4 = num4 / num2;
		int rs5 = num4 % num3;
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
				
		//����, ���ҿ�����
		num1++; //+1
		++num1; //++�� �տ� �ᵵ �ǰ� �ڿ� �ᵵ ��
		num2--; //-1
		--num2;
		
		System.out.println("num1++ : "+num1);
		System.out.println("num2-- : "+num2);
		
		//���մ��Կ�����
		int n1 = 1, n2 = 2, n3 =3, n4 =4;
		
		n1 += 1; // n1=n1+1
		n2 -= 2; // n2=n2-2
		n3 *= 3; // n3=n3*3
		n4 /= 4; // n4=n4/4
		
		System.out.println("n1+= : "+n1);
		System.out.println("n2-= : "+n2);
		System.out.println("n3*= : "+n3);
		System.out.println("n4/= : "+n4);
		
		//�񱳿�����
		int var1 = 1;
		int var2 = 2;
		
		boolean r1 = (var1 >  var2);
		boolean r2 = (var1 <  var2);
		boolean r3 = (var1 >= var2);
		boolean r4 = (var1 <= var2);
		boolean r5 = (var1 == var2);
		boolean r6 = (var1 != var2);
		
		System.out.println("r1 : "+r1); // var1�� var2���� ũ��
		System.out.println("r2 : "+r2); // var1�� var2���� �۴�
		System.out.println("r3 : "+r3); // var1�� var2���� ũ�ų� ����
		System.out.println("r4 : "+r4); // var1�� var2���� �۰ų� ����
		System.out.println("r5 : "+r5); // var1�� var2�� ����
		System.out.println("r6 : "+r6); // var1�� var2�� �ٸ���
		
		//��������
		boolean res1 = (var1 > 1) && (var2 <  3); // &&=and=�� �� �¾ƾ���
		boolean res2 = (var1 > 0) && (var2 <= 2); // var1�� 0���� ũ�� var2�� 2���� �۰ų����� = ����
		boolean res3 = (var1 > 0) || (var2 >  3); // ||=or=�ϳ��� �¾Ƶ� ��
		boolean res4 = (var1 < 0) || (var2 >  3); 
		boolean res5 = !(var1 > var2); // ! = not
		
		System.out.println("res1 : "+res1); //t and f
		System.out.println("res2 : "+res2); //t and t
		System.out.println("res3 : "+res3); //t or f
		System.out.println("res4 : "+res4); //f or f
		System.out.println("res5 : "+res5); //not
		
	}

}
