package exam;

public class MemberServiceExam {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean rs = memberService.login("hong", "12345");

		if(rs) {
			System.out.println("로그인되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 패스워드가 올바르지 않습니다.");
		}
	}
}
