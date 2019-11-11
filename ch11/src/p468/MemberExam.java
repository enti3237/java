package p468;

import p467.Member;

public class MemberExam {
	public static void main(String[] args) throws Exception {
		
		Member original = new Member("blue", "Miki", "12345", 24, true);
		
		Member cloned = original.getMember();
		cloned.pass = "678909";
		
		System.out.println("복제객체의 필드값");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("pass :" + cloned.pass);
		System.out.println("age :" + cloned.age);
		System.out.println("adult :" + cloned.adult);
		System.out.println();
		
		System.out.println("원본객체의 필드값");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("pass :" + original.pass);
		System.out.println("age :" + original.age);
		System.out.println("adult :" + original.adult);
		
	}
}
