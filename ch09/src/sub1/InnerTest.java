package sub1;
/*
 * 날짜 : 2019-10-22
 * 이름 : 이지영
 * 내용 : 중첩 클래스 실습하기 교재 p.390
 */

import sub1.Outer.Inner;
//중첩 클래스 시 임포트가 필요하다

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(1);
		inn.info();
		
	}
}