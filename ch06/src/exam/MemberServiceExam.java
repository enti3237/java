package exam;

public class MemberServiceExam {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean rs = memberService.login("hong", "12345");

		if(rs) {
			System.out.println("�α��εǾ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� �н����尡 �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
