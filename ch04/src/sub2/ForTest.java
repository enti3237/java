package sub2;

/*
 * ��¥ : 2019-10-14
 * �̸� : ������
 * ���� : for �� �ǽ��ϱ� 
 */

public class ForTest {
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		
		//for (int�� ���ٸ��� ���� ���ص� �Ǵ±���...)
		for(int i=1 ; i<=3 ; i++) {
			System.out.println("Hello Java!");
		}
		
		//1���� 10������ �� (�̰� ���� a+b ���¶� ab�� �� �����������)
		int sum = 0;
		for(int k = 1 ; k <= 10 ; k++) {
			sum += k;
		}

		System.out.println("1���� 10������ �� : " +sum);
		System.out.println();
		
		//1���� 10���� ¦����
		int total = 0;

		/*	for(int k = 0 ; k <= 10 ; k+=2) {
			total += k; (�̷��� �Ǳ� ������) */ 

		for(int k = 0 ; k <= 10 ; k+=2) {
			if(k%2==0) {
				total += k;
			}
		
		}
		System.out.println("1���� 10���� ¦���� �� : " + total);
		System.out.println();
		
		//��ø for ��
		
		for(int a=1 ; a<=3 ; a++) {
			System.out.println("a : "+a);
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : "+b);
			}
		}
		System.out.println();

		//������ ���
		
		for(int a=2 ; a<=9 ; a++) {
			System.out.println();
			System.out.println(a+"��");
			
			for(int b=1 ; b<=9 ; b++) {
				int c = a*b;
			
				System.out.println(a+ "x" +b+ "=" +c); //2*1���� 9���� �ݺ������ �� 3���� ���ư��� �ٽ� �ݺ�
			}
		}
		
		//���ﰢ�� ���
		for(int start=1 ; start<=10 ; start++) {
			
			for(int end=1; end<=start ; end++) {
				System.out.print("��"); //println �ƴ϶� �ٹٲ� �ȵǰ� ���ٿ� ������µ�
			}
			
			System.out.print("\n");
		}

		//�����ﰢ�� ���
		for(int start=10 ; start>=1 ; start--) {
			
			for(int end=1; end<=start ; end++) {
				System.out.print("��");
			}
			
			System.out.print("\n");
		}

		//�����ﰢ�� ���
		for(int a=1 ; a<=5 ; a++) {
			System.out.print("\n");
			
			for(int b=1 ; b<=5-a ; b++) {
				System.out.print("��");
			}
			
			for(int c=1 ; c<=a ; c++) {
				System.out.print("��");
			}
		}
		
		
		
		
		
		
		
	}
}