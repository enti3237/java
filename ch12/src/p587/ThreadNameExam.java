package p587;

public class ThreadNameExam {

	// ������ �⹦�ϰ� ���̳�
	public static void main(String[] args) throws Exception {

		Thread main = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + main.getName());

		ThreadA a = new ThreadA();
		System.out.println("�۾������� �̸�" + a.getName());
		a.start();

		ThreadB b = new ThreadB();
		System.out.println("�۾������� �̸�" + b.getName());
		b.start();

	}
}
//���α׷� ���� ������ > ������ ab�� �������� ���۵ǹǷ� run�� ���빰�� �״�� �������� ab�� ����Ʈ����� �ڴ���� 