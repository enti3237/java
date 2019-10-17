package sub1;
/*
 * 날짜 : 2019-10-15
 * 이름 : 이지영
 * 내용 : 메서드 실습하기 교재 p214
 */

public class MethodTest {
	//main 메소드 : 자바프로그램의 시작점
	public static void main(String[] args) {
		//메소드 실행(호출)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
	}
	
	//fx메서드 정의
	//void는 아무것도 없다는 뜻이라 리턴을 사용하고 싶으면 void란에 써주기
	public static int fx(int x) { 
		int y = 2*x + 1;
		return y;
	}
}
