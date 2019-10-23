package sub2;
/*
 * 날짜 : 2019-10-23
 * 이름 : 이지영
 * 내용 : 자바 내장클래스 String 실습하기 교재 p.406
 */

public class StringTest {
	public static void main(String[] args) {
		
		//문자열 = 문자 + 배열
		String s = "Hello";
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		
		//문자열 객체생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello"; //리터럴 선언
		String str4 = "Hello";
		
		//참조값 주소 비교 - 1, 2, 3의 주소값은 다르다 3과 4는 같다
		if(str1 == str2) {
			System.out.println("str1과 str2의 참조값(주소값)이 같다.");
		} else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다.");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4의 참조값(주소값)이 같다.");
		} else {
			System.out.println("str3과 str4의 참조값(주소값)이 다르다.");
		}
		
		//문자열 비교
		if(str1.equals(str4)) {
			System.out.println("str1과 str2의 문자열값(단어)이 같다.");			
		} else {
			System.out.println("str1과 str2의 문자열값(단어)이 다르다.");
		}
		
	}

}
