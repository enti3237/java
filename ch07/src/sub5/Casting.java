package sub5;
/*
 * 날짜 : 2019-10-21
 * 이름 : 이지영
 * 내용 : 캐스팅 실습하기 p.324
 */

import sub4.Animal;
import sub4.Eagle;
import sub4.Tiger;

public class Casting {
	public static void main(String[] args) {
		
		int    num1 = 1;
		double num2 = num1;
		
		double var1 = 1.23;
		//캐스팅 - 타입변환
		int    var2 = (int)var1;
		
		System.out.println(num2);
		System.out.println(var2);
		
		//업캐스팅(다형성 적용)
//		Tiger t = new Tiger();
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		
		//다운캐스팅 (원래의 선언타입으로 되돌릴 때 - 참조타입 지정해야함)
		Tiger t = (Tiger)a1;
		Eagle e = (Eagle)a2;
		
		t.move();
		e.move();
		a1.move();
		a2.move();
	}
}
