package p505;

public class StringIndexExam {
	public static void main(String[] args) {

		String sub = "JAVA Programming";

		int location = sub.indexOf("Programming");
		System.out.println(location); // Programming이 시작되는 문자열 위치

		if (sub.indexOf("JAVA") != -1) { // JAVA가 들어가면 (대소문자 구별함)
			System.out.println("make JAVA");
		} else {
			System.out.println("no JAVA");
		}
	}
}
