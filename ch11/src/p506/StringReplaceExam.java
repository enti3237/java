package p506;

public class StringReplaceExam {
	public static void main(String[] args) {
		
		String str1 = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String str2 = str1.replace("자바", "JAVA");
		System.out.println(str1);
		System.out.println(str2);
	}
}
