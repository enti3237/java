package exam191025;
/*
 * 劾促 : 2019-10-25
 * 戚硯 : 戚走慎
 * 鎧遂 : 呪楳汝亜辞 汝亜庚牌 05-LogInOut坦軒
 */

public class MemberService {
	public boolean login(String id, String password) {
		
		//稽益昔 五辞球澗 id亜 "hong" password亜 "12345"析 凶 trur return 益 須殖 false 
		if(id.equals("hong") && password.equals("12345")) {
//			if(id=="hong" && password=="12345") { 蟹袴走澗 陥 細食隔奄 叔鳶稽 昔廃 姶繊戚醸澗汽 戚闇 溌叔備 堂携陥焼たたたたたたたたたたた
			return true;
		} else {
			return false;
		}
	}
	
	//稽益焼数 五辞球澗 "稽益焼数 鞠醸柔艦陥"亜 窒径吃 依
	public void logout(String id) {
		System.out.println("稽益焼数 鞠醸柔艦陥.");
	}
}