package p501;

public class StringEqualsExam {
	public static void main(String[] args) {
		String var1 = new String("Miki");
		String var2 = "Miki";

		if (var1 == var2) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}

		if (var1.equals(var2)) {
			System.out.println("문자열이 같다.");
		} else {
			System.out.println("문자열이 다르다.");
		}
	}
}
