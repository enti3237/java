package sub1;
/*
 * ��¥ : 2019-10-28
 * �̸� : ������
 * ���� : ���ٽ� �ǽ��ϱ� ���� p678
 */

public class LambdaTest {
	public static void main(String[] args) {

		// ���ٽ� : �Ű������� ���� �ڵ��
		Type1 t1 = () -> {
			System.out.println("Type1 ���ٽ� ����");
		};
		Type2 t2 = (x) -> {
			System.out.println("Type2 ���ٽ� ���� : " + x);
		};
		Type3 t3 = (x, y) -> {
			int rs = x + y;
			return rs;
		};

		// ���ٽ� ����
		t1.fx();
		t2.fx(1);
		int rs = t3.fx(2, 3); // ���Ϲ��̴ϱ� �޾ƿ;���
		System.out.println("Type3 ���ٽ� ���� : " + rs);
	}

}
