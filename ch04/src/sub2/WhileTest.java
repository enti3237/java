package sub2;

/*
 * ��¥ : 2019-10-14
 * �̸� : ������
 * ���� : while �ݺ��� �ǽ��ϱ�
 */

public class WhileTest {

	public static void main(String[] args) {
		
		// 1���� 10������ ��
		// for�ʹ� �޸� ���ǹ��� �ۿ� ��������
		
		int k = 1;
		int sum = 0;
		
		while(k<=1000) {
			sum += k;
			k++;
		}
		
		System.out.println("1���� 10������ �� : " +sum);
		
		
		// do ~while (�ѹ��� ������ ����ǰ� �ϴµ� �ǹ̰� �ִ�)
		
		int total = 0;
		int i = 1;
		
		do {
			if (i%2 == 1) {

				total += i; // �̰� �߰�ȣ �� �ᵵ �Ǳ� �ϴ��� ������;
			}
			
			i++;
			
		}while(i<=10);
		
		System.out.println("1���� 10���� Ȧ���� �� : " +total);

	
		// break
		
		int num = 0;
		
		while(true) { 						//while(true) = ���ѹݺ� �� ����. break�� ���δ�
			num++;

			if (num%5 == 0 && num%7 ==0) { 	//1�� ��� �����ϴ� num�� 5�� 7�� �������� �� �������� 0�� �ȴٸ�
				break; 						//�ݺ��� Ż�� 
			}
		}
		
		System.out.println("5�� 7�� �ּҰ���� : " + num); //�� ���� ���� ���α׷����� ���ǰ� ������
		
		
		// continue
		int tot = 0;
		
		for(int a=1 ; a<=10 ; a++) {
			if(a%2 == 0) {
				continue; 					// �ݺ����� ������ �ǵ���������
			}
			
			tot += a;
		}
		
		System.out.println("1���� 10������ Ȧ���� : "+tot);
		
	}
	
}
