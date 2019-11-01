package sub2;

/*
 * ��¥ : 2019-10-28
 * �̸� : ������
 * ���� : ���ٽ� �ǽ��ϱ�
 */
public class LambdaThreadTest {

	public static void main(String[] args) throws Exception {

		Runnable r = () -> {

			for (int i = 1; i <= 10; i++) {
				// ���ξ����忡�� throws�� �Կ��൵ ����� ������ �޶� try-catch�� ����� ��
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���꾲���� ����...");
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println("���ξ����� ����!");
		}

		System.out.println("���α׷� ����");

	}

}
