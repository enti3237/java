package p519;

import java.util.regex.Pattern;

public class PatternExam {
	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1111-2222";
		boolean rs = Pattern.matches(regExp, data);
		if (rs) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angeal@navercom";
		rs = Pattern.matches(regExp, data);
		if (rs) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
