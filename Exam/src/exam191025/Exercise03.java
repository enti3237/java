package exam191025;
/*
 * ��¥ : 2019-10-25
 * �̸� : ������
 * ���� : �����򰡼� �򰡹��� 03
 */

public class Exercise03 {
	public static void main(String[] args) {

		//for���� ����Ͽ� 1~100������ ���� �� 3�� ����� ������ ���Ͻÿ� (5)
		int sum = 0;

		for(int i=0 ; i<=100 ; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		
		System.out.println("3�� ����� �� : " +sum);
		
	}
}