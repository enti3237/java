package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 05-LogInOut처리
 */

public class MemberService {
	public boolean login(String id, String password) {
		
		//로그인 메서드는 id가 "hong" password가 "12345"일 때 trur return 그 외엔 false 
		if(id=="hong" && password=="12345") {
			return true;
		} else {
			return false;
		}
	}
	
	//로그아웃 메서드는 "로그아웃 되었습니다"가 출력될 것
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
