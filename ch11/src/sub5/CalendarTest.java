package sub5;
import java.util.Calendar;

/*
 * 날짜 : 2019-10-23
 * 이름 : 이지영
 * 내용 : 자바  Calendar 클래스 실습하기 교재 p.538
 */
public class CalendarTest {
	public static void main(String[] args) {
		
		//Calendar는 추상클래스라 객체생성을 못함
		Calendar cal = Calendar.getInstance();
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date  = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min  = cal.get(Calendar.MINUTE);
		int sec  = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 \n", year, month, date);
		System.out.printf("%d: %d: %d \n", hour, min, sec);
		
		
	}

}
