package sub2;

public class BookExam {
	public static void main(String[] args) {
		
		//1~100�� ��
		int sum = 0;
		for (int a=1 ; a<=100 ; a++) {
			sum += a;
		}
		System.out.println("1���� 100������ �� : " +sum);

		int sum2 = 0;
		int i2 = 1;
		
		while(i2<=100) {
			sum2+=i2;
			i2++;
		}
		System.out.println("while�� ����� 1~100�� �� : " +sum2);
		
		//������
		for(int m=2 ; m<=9 ; m++) {
			System.out.println();
			System.out.println(m+"��");
			for(int n=1 ; n<=9 ; n++) {
				int rs = m*n;
				System.out.println(m+"X"+n+"="+rs);
			}
		}
		
		
	}

}
