package p179;
import p175.Week;

public class EnumMethodExam {
	public static void main(String[] args) {
		//name() 메소드 - 열거객체가 가진 문자열을 가져온다(리턴한다)
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//original() 메소드 - 이 객체가 몇번째 객체냐 'ㅁ' 0부터 시작하는 것을 잊지말것
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int rs1 = day1.compareTo(day2); //2를 기준으로 1의 위치를 리턴한다 = 수요일 기준 월요일은 -2
		int rs2 = day2.compareTo(day1); //1을 기준으로 2의 위치를 리턴한다 = 월요일 기준 수요일은 +2
		System.out.println(rs1);
		System.out.println(rs2);

		//valueOf() 메소드
		//args를 실행하기 위해서 Run Configuration>해당페이지의 Arguments 탭에서 내용을 입력할 필요가 있다. 현재 FRIDAY 입력함
		if(args.length == 1) {
			String strDay = args[0];
			Week weekday = Week.valueOf(strDay);
			if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
				System.out.println("주말");
			} else {
				System.out.println("평일");
			}
		}
		
		//values() 메소드 - 향상된 for문으로 열거타입의 모든 객체를 나열함
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
