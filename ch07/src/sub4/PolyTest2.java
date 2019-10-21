package sub4;
/*
 * 날짜 : 2019-10-21
 * 이름 : 이지영
 * 내용 : 다형성 실습하기 p.305
 */

public class PolyTest2 {
	
	public static void main(String[] args) {

		//이렇게도 할 수 있는데
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		//객체배열 (이 경우 Tiger도 Eagle도 Shark도 쓸 수 없다)
		Animal objs[] = {t, e, s};
		
		objs[0].move();
		objs[0].hunt();
		
		objs[1].move();
		objs[1].hunt();
		
		objs[2].move();
		objs[2].hunt();
		
		System.out.println();

		//다형성을 이용한 메서드의 매개변수
		move(t);
		move(e);
		move(s);
	}
	
	public static void move(Animal a) {
		a.move();
	}
}
