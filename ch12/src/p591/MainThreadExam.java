package p591;

public class MainThreadExam {
	public static void main(String[] args) {

		Calc calc = new Calc();

		// User1 ������ ���� - ������ü ���� - ������ ����
		User1 user1 = new User1();
		user1.setCalc(calc);
		user1.start();

		// User2 ������ ���� - ������ü ���� - ������ ����
		User2 user2 = new User2();
		user2.setCalc(calc);
		user2.start();

		// ����� 50/50���� ��� User2�� Calc�� User1�� ���� �Ծ...
		// ������ ���� Calc�� ����ȭ�� ��Ŵ
	}
}