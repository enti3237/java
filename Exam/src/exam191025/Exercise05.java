package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 05
 */

public class Exercise05 {
	public static void main(String[] args) {
		
		//로그인되었습니다 \% 로그아웃되었습니다가 출력되도록 (10)
		MemberService memberService = new MemberService();
		//아이디에 hong, 패스워드에 12345가 입력됨
		boolean result = memberService.login("hong", "12345");
	
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}
}