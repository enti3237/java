package sub6;
/*
 * ��¥ : 2019-10-21
 * �̸� : ������
 * ���� : �߻�Ŭ���� �ǽ��ϱ� p.329
 */

public class AbstractTest {
	public static void main(String[] args) {
		
		//Unit unit = new Unit();
		//�߻�Ŭ������ ��ü���� �Ұ���
		
		//������ �̰� �ȴ� ��_��) ���� ��
		Unit u1 = new Marin();
		Unit u2 = new Zealot();
		Unit u3 = new Zerg();
		
		u1.move();
		u1.attack();
		u1.special();
		System.out.println();
		
		u2.move();
		u2.attack();
		u2.special();
		System.out.println();
		
		u3.move();
		u3.attack();
		u3.special();
	}

}
