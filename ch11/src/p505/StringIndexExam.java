package p505;

public class StringIndexExam {
	public static void main(String[] args) {

		String sub = "JAVA Programming";

		int location = sub.indexOf("Programming");
		System.out.println(location); // Programming�� ���۵Ǵ� ���ڿ� ��ġ

		if (sub.indexOf("JAVA") != -1) { // JAVA�� ���� (��ҹ��� ������)
			System.out.println("make JAVA");
		} else {
			System.out.println("no JAVA");
		}
	}
}
