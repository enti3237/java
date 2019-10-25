package p728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		//String ��ü�� ����
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		//����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü��: "+size);
		System.out.println();
		
		//2�� �ε����� ��ü ���
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		//����� �� ��ü ����ŭ ����
		for(int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);
			System.out.println(i + ":" +str);
		}
		System.out.println();
			
		list.remove(2);
		list.remove(2);
		list.remove("Java");
		
		for(int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);
			System.out.println(i + ":" +str);
		}
	}
}
