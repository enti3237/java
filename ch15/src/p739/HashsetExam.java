package p739;

import java.util.HashSet;
import java.util.Set;
import p738.Member;

public class HashsetExam {
	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();

		//�ν��Ͻ��� �ٸ����� ���� �����Ͱ� ����
		set.add(new Member("ȫ�浿", 24));
		set.add(new Member("ȫ�浿", 24));
		
		System.out.println("�� ��ü�� : " +set.size());
		
	}

}
