package p479;

import java.util.Objects;

public class NullExam {
	public static void main(String[] args) {

		String str1 = "Miki";
		String str2 = null;

		System.out.println(Objects.requireNonNull(str1));

		try {
			String name = Objects.requireNonNull(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, "no name");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, () -> "noooo nameeeee");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
