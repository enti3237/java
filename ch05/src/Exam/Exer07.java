package Exam;

public class Exer07 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		int min = array[0];
		
		//for���� ����� �ֿ��� �迭�� �ִ� ���ϱ�
		for(int i=0 ; i<array.length ; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: "+max);
		
		//�ּҰ��� ���غ���
		for(int i=0 ; i<array.length ; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println("min: "+min);
	}
}
