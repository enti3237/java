package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��¥ : 2019-10-24
 * �̸� : ������
 * ���� : �÷��� �����ӿ�ũ ����Ʈ �ǽ��ϱ� ���� p.733
 */
public class SetTest {
	public static void main(String[] args) {
		
		//���� ���� �� ������ ���� - Hashset ���� Set ���� �� ����
		Set<Double> set = new HashSet<Double>();
		
		set.add(1.0);
		set.add(2.0);
		set.add(3.0);
		set.add(4.0);
		set.add(2.0); //������ �ߺ� �Ұ�
		
		System.out.println(set);
		System.out.println(set.size());

		//���տ��� ������ - �����ؼ� ���� �� ����
		//���տ��Ҹ� (��������) �������ִ� �ݺ���
		//�� it �� ���� ��������
		Iterator<Double> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
