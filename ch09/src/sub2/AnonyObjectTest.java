package sub2;
/*
 * 날짜 : 2019-10-22
 * 이름 : 이지영
 * 내용 : 익명 클래스 실습하기 교재 p.404
 */

public class AnonyObjectTest {
	public static void main(String[] args) {
		
		//익명객체 - 인터페이스를 클래스 구현 없이 new 연산으로 정의한 형태
		//new Person() {
		Person p = new Person() {
			
			@Override
			public void info() {				
				System.out.println("Person info...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
				}
		}; //세미콜론은 걍 문법으로...
		
		//얘들을 구현하기 위해서 new Person 앞에 객체생성
		p.info();
		p.hello();
		
	}
}