package sub2;
/*
 * ��¥ : 2019-10-28
 * �̸� : ������
 * ���� : 
 */

public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {

		Count count = new Count();

		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);

		ct1.start();
		ct2.start();
		ct3.start();

		// ���꽺���尡 ���ν������ �ٽ� �շ��Ǳ���� ���ν����� ���

		ct1.join();
		ct2.join();
		ct3.join();

		System.out.println("���: " + count.getNum());

	}

}
//
