package sub1;
/*
 * 날짜 : 2019-10-23
 * 이름 : 이지영
 * 내용 : 자바 내장클래스 object 실습하기 교재 p.457
 */

public class ObjectTest {
	public static void main(String[] args) {

		Apple a1 = new Apple("한국", 2000);
		Apple a2 = new Apple("일본", 1000);
		Banana b1 = new Banana("대만", 2500);
		Banana b2 = new Banana("제주", 3500);
		
		//Object는 자바 모든 클래스의 최상위라 다형성에 활용 가능
		Object fruit[] = {a1, a2, b1, b2};
		
		//다운캐스팅
		Apple f1  = (Apple) fruit[0];
		Banana f3 = (Banana) fruit[2];
		
		f1.info();
		f3.info();
	}

}
