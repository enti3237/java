package sub2;

/*
 * 날짜 : 2019-10-10
 * 이름 : 이지영
 * 내용 : 
 */

public class DataTypeTest { // 클래스이름은 영어대문자로 시작
	
	public static void main(String[] args) {

		// 타입종류 : 정수형 int
		byte  var1 = 127; // 타입을 먼저 선언할 필요가 있음. 변수이름은 소문자로 시작
		short var2 = 32767; // int 외의 나머지는 잘 안 씀 ㅇㅅㅇ
		int   var3 = 2147483647; // 위에서 아래로 정수의 크기 순서대로. 8바이트.
		long  var4 = 9999999999999999L; // 숫자 뒤에 L붙여야함. 16바이트라 무거워서 안 씀
		
		// 실수형 double
		float  var5 = 1.123456789f; // 소수점 7자리까지만 출력되는데 뒤에 f도 붙여야해서 잘 안 씀
		double var6 = 1.1234567890123456789; // 소수점 16자리까지

		// 논리형 boolean
		boolean var7 = true;
		boolean var8 = false;
		
		// 문자형 char
		char ch1 = 'A'; // 딱 한글자만 쓸 수 있어서 별로 효용성이 없다 ㅇㅅㅇ
		char ch2 = '人'; // 심지어 이건 출력도 안되겠지-되잖아-자바는 유니코드를 쓰기에 2바이트 가능... 하지만 Aa는 안됨
		
		// 문자열 String
		String str1 = "A"; // char는 '작은따옴표'로, String은 "큰따옴표"로
		String str2 = "Apple";
		String str3 = "사과";
		
		int     a1 = 134;
		double  a2 = 1.34;
		boolean a3 = false;
		String  a4 = "risky";
		
		System.out.println(+a1);
		System.out.println(+a2);
		System.out.println(a3); //+를 붙이지 않거나...
		System.out.println(""+a4); //"" 를 붙여야 한다 왜죠...
		
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("str3 : "+str3);
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);

				
	}

}
