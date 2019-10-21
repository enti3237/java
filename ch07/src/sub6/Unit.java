package sub6;

//추상클래스 
//- 추상메서드를 갖는 클래스
//- 상속을 위한 클래스. 자신은 객체생성 불가능함
//- 구조화된 클래스 설계를 제공한다 = 규격화
public abstract class Unit {

	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상 메서드 선언 ( {구현} 아님 - 구현은 자식이... 뭐 이런 부모가 ㅇ_ㅇ) 
	// 앞에 abstract 붙여주기 (클래스명에도)
	public abstract void attack();
	public abstract void special();

}
