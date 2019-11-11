package p510;

public class StringTrimExam {
	public static void main(String[] args) {

		String t1 = "   02";
		String t2 = "123  	";
		String t3 = "   902451    ";

		String trim = t1.trim() + t2.trim() + t3.trim();
		System.out.println(trim);
	}
}