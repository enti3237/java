package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 09 - int:str 형전환
 */

public class Exercise09 {
	public static void main(String[] args) {

		String strData1 = "200";
		int intData1    = Integer.parseInt(strData1);
		
		int intData2    = 150;
		String strData2 = String.valueOf(intData2);
		
		System.out.println("intData1 : " + intData1);
		System.out.println("strData2 : " + strData2);
		
	}
}