package p501;

public class StringEqualsExam {
	public static void main(String[] args) {
		String var1 = new String("Miki");
		String var2 = "Miki";

		if (var1 == var2) {
			System.out.println("���� ��ü�� ����");
		} else {
			System.out.println("�ٸ� ��ü�� ����");
		}

		if (var1.equals(var2)) {
			System.out.println("���ڿ��� ����.");
		} else {
			System.out.println("���ڿ��� �ٸ���.");
		}
	}
}
