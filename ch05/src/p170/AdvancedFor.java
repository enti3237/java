package p170;

public class AdvancedFor {
	public static void main(String[] args) {

		int[] scores = {95, 71, 84, 93, 87};
	
		int sum = 0;
		//�������� �� ���� ���� for�� (Ÿ�Ժ��� : �迭)
		for(int score : scores) {
			sum += score;
			}
		System.out.println("���� ���� : "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� : "+avg );

		//���� for�� ����
		String[] names = {"������", "������", "�̼���"};

		for(String name : names) {
			System.out.println(name);
		}
	}
}
