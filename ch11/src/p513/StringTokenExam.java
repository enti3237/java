package p513;

import java.util.StringTokenizer;

public class StringTokenExam {
	public static void main(String[] args) {

		String txt = "Mikael/Raphael/Lucifel";

		StringTokenizer st = new StringTokenizer(txt, "/");
		int count = st.countTokens();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println();

		st = new StringTokenizer(txt, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
