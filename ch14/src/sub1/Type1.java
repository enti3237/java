package sub1;

// 람다식으로 사용하기 위한 인터페이스 선언 어노테이션
@FunctionalInterface
public interface Type1 {
	
	public void fx();
	//public void fx2();	2개 이상의 추상메서드 선언 못함
}
