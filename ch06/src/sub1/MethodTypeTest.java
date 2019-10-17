package sub1;
/*
 * 날짜 : 2019-10-15
 * 이름 : 이지영
 * 내용 : 메서드 타입 실습하기
 */
public class MethodTypeTest {
	public static void main(String[] args) {

		int rs1 = type1(2,4);
		System.out.println("rs1 :" +rs1);

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		type2(arr); //type2는 리턴값이 없으므로 출력식이 나오면 안됨
		
		double rs2 = type3() *5 *5;
		System.out.println("반지름이 5인 원의 넓이 :" +rs2);
		
		type4();
		
		//구구단 함수 실행
		gugudan(2);
		gugudan(5);
		gugudan(7);
	}
	
	// 구구단 함수 정의 (매개변수 있음 리턴 없음 : 계산식이 있어도 리턴이 없으면 없는거군...)
	public static void gugudan(int n) {
		System.out.println(n+ "단");
		for(int i=2 ; i<=9 ; i++) {
			System.out.println(n+ "X" +i+ "=" +n*i);
		}
	}
	
	// 타입1 - 매개변수 O / 리턴 O → 괄호 안에 변수 선언을 해야함 → 선언한 변수와 같은 타입을 void 대신 쓴다
	public static int type1(int a, int b) {
		int c = a + b;
		return c;
	}

	// 타입2 - 매개변수 O / 리턴 X → 괄호 안에 변수 선언을 해야함 → 리턴이 없으므로 void를 그대로 
	public static void type2(int[] score) {
		int sum = 0;
		for(int s : score ) {
			sum += s;
		}
		System.out.println("배열의 합 : "+sum);
	}
	
	// 타입3 - 매개변수 X / 리턴 O → 변수 선언 안함 → 리턴값에 따라 void를 변경함
	public static double type3() {
		return 3.14;
	}
	
	// 타입4 - 매개변수 X / 리턴 X → 변수 선언 안함 → 리턴이 없으므로 void를 그대로 
	public static void type4() {
		int result = type1(3, 7);
		System.out.println("type4의 result :" +result);
	}
}