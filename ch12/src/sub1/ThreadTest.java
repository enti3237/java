package sub1;
/*
 * ��¥ : 2019-10-28
 * �̸� : ������
 * ���� : ������Thread �ǽ��ϱ� ���� p576
 */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		// try-catch�� ���� ������ ����ó�� throws

		SubThread sub1 = new SubThread("����1");
		SubThread sub2 = new SubThread("����2");

		// �񵿱������� ����
		sub1.start();
		sub2.start();

//		sub1.run();
//		sub2.run();

		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println("���ξ����� ����...");
		}
		System.out.println("���� ����...");
	}

}
