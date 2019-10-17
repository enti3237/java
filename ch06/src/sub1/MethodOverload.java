package sub1;
/*
 * 날짜 : 2019-10-15
 * 이름 : 이지영
 * 내용 : 오버로드 메서드(함수) 실습하기 교재 p214
 */
public class MethodOverload {
	public static void main(String[] args) {
		
		overload(1);
		overload(1,9);
		overload("at");
		overload(true);
		
	}
	
	// overload 메소드 : 이름이 같아도 매개변수로 구별 가능한 메소드
	public static void overload(int a) {
		System.out.println("첫번째 오버로드 메서드 실행...");
	}
	public static void overload(int a, int b) {
		System.out.println("두번째 오버로드 메서드 실행...");
	}
	public static void overload(String name) {
		System.out.println("세번째 오버로드 메서드 실행...");
	}
	public static void overload(boolean isOK) {
		System.out.println("네번째 오버로드 메서드 실행...");
	}

}
