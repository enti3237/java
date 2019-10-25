package p739;

import java.util.HashSet;
import java.util.Set;
import p738.Member;

public class HashsetExam {
	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();

		//인스턴스가 다르지만 내부 데이터가 동일
		set.add(new Member("홍길동", 24));
		set.add(new Member("홍길동", 24));
		
		System.out.println("총 객체수 : " +set.size());
		
	}

}
