package p737;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String ��ü�� �ߺ� ���� �����ϴ� Hashset

public class HashSetExam {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		//Java�� �ѹ��� �����
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ä �� : " +size);
		
		//�ݺ��� ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		//�׳� size �ϸ� �� ���´� ��_��)
		System.out.println("�� ��ä �� : " +set.size());
		
		//�ݺ��� ���
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//��� ��ü�� ��������
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������");
		} else {
			System.out.println("�� �����");
		}
		
	}
	

}
