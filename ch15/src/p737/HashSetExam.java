package p737;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String 객체를 중복 없이 저장하는 Hashset

public class HashSetExam {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		//Java는 한번만 저장됨
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객채 수 : " +size);
		
		//반복자 얻기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		//그냥 size 하면 안 나온다 ㅇ_ㅇ)
		System.out.println("총 객채 수 : " +set.size());
		
		//반복자 얻기
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//모든 객체를 날려버림
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("안 비었음");
		}
		
	}
	

}
