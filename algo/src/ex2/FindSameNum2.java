package ex2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ��¥ : OOOO/OO/OO
 * �̸� : ��ö��
 * ���� : �˰��� �ǽ� - �ߺ����� ã��
 * 
 * ���߰���
 * 1) numbs1�� ù��° ���� 6�� �ڿ� �ִ� 3, 5, 3, 7�� ���ʷ� ��, 6�� �ߺ��� ���� �߰� ����.
 * 2) �ι�° ���� 3�� �ڿ� �ִ� ���� 5, 3, 7�� ���ʷ� ��, �տ� �ִ� 6���� �̹� ������, 4��° �ڸ� 3�� �ߺ� �߰�. 
 * 3) �߰ߵ� �ߺ� ���� 3�� ���� resultSet�� ����
 * 4) resultSet�� ����� ������ ���
 */
public class FindSameNum2 {

	public static void main(String[] args) {

		// ���߿� ������
		int[] numbs1 = {6, 3, 5, 3, 7};

		// �׽�Ʈ�� ������
		int[] numbs2 = {1, 5, 9, 7, 5, 3, 2, 5, 3, 1};

		Set<Integer> resultSet = fineSameNumber(numbs2);

		// ���� ���

		System.out.println(Arrays.toString(numbs1));
		System.out.println(Arrays.toString(numbs2));

		// ��¹���� ���� ���� ���ߴ�... �ܿ����� ��_��;
		Iterator<Integer> it = resultSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
	
	// fineSameNumber �޼��� ���� �̰ͱ��� �ƴµ� ��_��; (�̰� ����)
	// ����� �ؾ� numbs2�� �� �� ������ ���� (29���ٸ� �����ϸ� �ǳ�!)
	
	public static Set<Integer> fineSameNumber(int[] n) {
		
		Set<Integer> resultSet = new HashSet<>();
		
		for(int i=0 ; i<n.length ; i++){
			for(int j=i+1 ; j<n.length ; j++) {
				if(n[i] == n[j]) {
					resultSet.add(n[i]);
				} 
			}
		}
		
		return resultSet;
		//29�� �ٷ� �Ѿ
	}
}