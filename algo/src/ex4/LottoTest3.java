package ex4;

import java.util.Arrays;

public class LottoTest3 {
	public static void main(String[] args) {
		//�ʵ� ����
		int[] lotto = new int[6];
		//6�ڸ��� 45������ �������� ����
		for(int i=0 ; i<lotto.length ; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			//�� �ڸ��� �ߺ��� ���ڸ� ���� �ε��� ���ڸ� �ϳ� �ٿ��� �ٽ� �����. ������ �ε��� ����������.
			for(int j=0 ; j<i ; j++) {
				if(num == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(num + " ");
			//�̰� �Ʒ��ٿ� �� �� num�� for�� �ȿ��� �־��� �Լ�
			//for�� �ۿ� �θ� ���� �ʳ�? > �� �̷��� �׳� ���� ���ڰ� ���Ѵ�� �����ǰڱ׳� ��_)
		}
		System.out.println();
		System.out.println("������ �ζǹ�ȣ : " + Arrays.toString(lotto));
		//Array ��  Arrays�� �ٸ��ϴ� toString�� �� ������ ���� �� �質 �ǽ��غ��ô�...
	}
}