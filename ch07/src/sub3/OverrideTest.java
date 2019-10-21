package sub3;
/*
 * 날짜:2019-10-21
 * 이름:이지영
 * 내용:오버라이드 메서드 실습
 */
public class OverrideTest {
	public static void main(String[] args) {
		BBB b = new BBB();
		// CCC c = new CCC();

		//부모의 메서드와 자식의 메서드가 선언포함 모든면이 동일하면 자식 메서드가 위에 덮어씌워짐 (재정의=override)
		b.method2();
//		c.method1();
//		c.method2();
		//int a의 method2는 오버로드 메소드 (같은 내용을 참조변수만 다르게 해서 쓴다)
//		c.method2(1);
//		c.method3();
		
		//final 실습 (변수를 상수화 한다. 이 경우 값을 대문자로 지정하는 경향이 있음)
		// - final 변수    : 상수화 
		// - final 메소드 : 오버라이드 금지
		// - final 클래스 : 상속 금지
		
		final int    NUM = 1;
		final double PI  = 3.14;
		// num = 2; // 이렇게 못 바꿈
		
		System.out.println(NUM);
		System.out.println(PI);

	}
}
