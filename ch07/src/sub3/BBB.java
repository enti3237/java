package sub3;

//클래스에도 final 지정 가능. 상속 불가능해짐
//물론 이럴 일은 별로 없다
public final class BBB extends AAA {
	
	//AAA의 1을 덮어씌움
	@Override
	public void method1() {
		System.out.println("BBB - method1()...");
	}
	
	//Overload (얘는 오버로드라 @를 안 쓴다)
	public void method2(int a) {
		System.out.println("BBB - method2()...");
	}

	//AAA의 3을 덮어씌움
	@Override
	public final void method3() {
		//final을 지정할 경우 오버라이드 금지 (CCC에 에러가 남)
		System.out.println("BBB - method3()...");
	}
}