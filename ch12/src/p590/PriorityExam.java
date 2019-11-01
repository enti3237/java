package p590;

public class PriorityExam {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread a = new CalcThread("thread" + i);
			if (i != 10) {
				a.setPriority(Thread.MIN_PRIORITY);
			} else {
				a.setPriority(Thread.MAX_PRIORITY);
			}
			a.start();
		}
	}
}
// 10���� a��� ������ ��ü�� �����ϰ� �̸��� 1234�� ���δ�
// thread10�� �ֿ켱������ �ش�.
// a ��ü�� Calc���� run ����� �������̵��ؼ� 1���� 20����� ������ �����Ѵ�
// ���� ���� �� 10 �������� ����
