package sub3;
/*
 * 날짜 : 2019-10-23
 * 이름 : 이지영
 * 내용 : 예외 던지기 실습하기
 * try-catch 외의 사용법
 */
public class ThrowTest {
	public static void main(String[] args) {
		
		Calc cal = new Calc();
		
		int rs1 = cal.plus(1, 2);
		int rs2 = cal.minus(1, 2);
		int rs3 = cal.mult(1, 2);
		int rs4 = 0;
		try {
			rs4 = cal.div(1, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 에러표시에 마우스를 갖다대면 surround 메시지가 뜨니까 클릭하면 바로 try-catch가 뜸
		// Calc 메소드에서 전달된 에러메시지를 처리한다
		// try 안에 들어가버린 기존 변수를 들어가기 전에 초기화 해주는 거 잊지 말기 
		
		System.out.println("rs1 = " +rs1);
		System.out.println("rs2 = " +rs2);
		System.out.println("rs3 = " +rs3);
		System.out.println("rs4 = " +rs4);
		System.out.println();
		System.out.println("프로그램 종료...");
		
	}

}
