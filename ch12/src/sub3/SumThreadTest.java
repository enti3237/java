package sub3;
/*
 * ��¥ : 2019-10-28
 * �̸� : ������
 * ���� : ������Thread �ǽ��ϱ� ���� p576
 */

//���Ͼ����� run
//st1�� ���꾲������ �����ڸ� �ҷ����� ��Ʈ �ڸ��� ���۰� ���� �������ֱ�
//�ֵ带 ����� ���꾲���忡�� �������̵� �� run ��ɾ setNum ��ɴ�� ���ۺ��� ������ �������� ������

//���վ����� start
//�� ���� ���ؼ� Imp...�����δ� ���ڶ� ��ܿ� Thread ��ü�� ���� �������� �� start��ɿ� �� ��ü�� �����Ѵ�
//join ���� �ʿ�. ����ȭ���� �ʿ���� ����

public class SumThreadTest {
	public static void main(String[] args) throws Exception {

		SubThread st1 = new SubThread(1, 50);
		SubThread st2 = new SubThread(51, 100);

		// ���ʺ����δ� ���ڶ� �����带 �����������
		Thread t1 = new Thread(st1);
		Thread t2 = new Thread(st2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		int rs1 = st1.getNum();
		int rs2 = st2.getNum();
		int tot = rs1 + rs2;

		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println("��� : " + tot);

	}
}