package p480;

import java.util.Objects;

public class ToStringExam {
	public static void main(String[] args) {
		
		String str1 = "Miki";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "no name"));
	}

}
