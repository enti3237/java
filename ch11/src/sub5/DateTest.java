package sub5;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 날짜 : 2019-10-23
 * 이름 : 이지영
 * 내용 : 자바  Date 클래스 실습하기 교재 p.539
 */

public class DateTest {
	public static void main(String[] args) {
		
		//얘는 신규객체 생성 가능
		Date d = new Date();
		
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("현재시간은 yyyy/MM/dd hh:mm:ss 입니다");
		String dd = sdf.format(d);
		System.out.println(dd);
		
	}
}
