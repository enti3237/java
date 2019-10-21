package sub6;
/*
 * 날짜 : 2019-10-21
 * 이름 : 이지영
 * 내용 : 추상클래스 실습하기 p.329
 */

public class AbstractTest {
	public static void main(String[] args) {
		
		//Unit unit = new Unit();
		//추상클래스는 객체생성 불가능
		
		//하지만 이건 된다 ㅇ_ㅇ) 주의 ★
		Unit u1 = new Marin();
		Unit u2 = new Zealot();
		Unit u3 = new Zerg();
		
		u1.move();
		u1.attack();
		u1.special();
		System.out.println();
		
		u2.move();
		u2.attack();
		u2.special();
		System.out.println();
		
		u3.move();
		u3.attack();
		u3.special();
	}

}
