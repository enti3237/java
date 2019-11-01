package sub1;

public class SubThread extends Thread {

	private String name;

	public SubThread(String name) {
		this.name = name;
	}

	@Override
	// run�� ������
	// override �޼ҵ� ��ü�� throws ���� �Ұ�. �����ϸ� �ٸ� �޼ҵ尡 �ȴ� �׷��Ƿ� �׳� try-catch ���
	public void run() {

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "������ ����...");
		}

		System.out.println(name + "����...");

	}

}