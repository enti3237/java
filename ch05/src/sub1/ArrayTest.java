package sub1;

/*
 * ��¥ : 2019-10-15
 * �̸� : ������
 * ���� : �迭 �ǽ��ϱ�
 */

public class ArrayTest {
	public static void main1(String[] args) {
		
		// �迭 (0���� �����Ѵ�)
		int num[] = {1, 2, 3, 4, 5};

		System.out.println("num �迭�� 1��° ���� : " +num[0]);
		System.out.println("num �迭�� 2��° ���� : " +num[1]);
		System.out.println("num �迭�� 3��° ���� : " +num[2]);
		System.out.println("num �迭�� 4��° ���� : " +num[3]);
		System.out.println("num �迭�� 5��° ���� : " +num[4]);
		
		for(int i = 0 ; i <5 ; i++) {
			System.out.println("num �迭�� "+(i+1)+"��° ���� : " +num [i]);
		}
		
		// ����
		String person[] = {"������", "������", "�庸��", "������", "�̼���"};
		
		for(int p=0 ; p<5 ; p++) {
			System.out.println((p+1)+"��° ��� �̸�: "+person[p]);
		}
		
	}

}
