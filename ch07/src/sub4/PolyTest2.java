package sub4;
/*
 * ��¥ : 2019-10-21
 * �̸� : ������
 * ���� : ������ �ǽ��ϱ� p.305
 */

public class PolyTest2 {
	
	public static void main(String[] args) {

		//�̷��Ե� �� �� �ִµ�
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		//��ü�迭 (�� ��� Tiger�� Eagle�� Shark�� �� �� ����)
		Animal objs[] = {t, e, s};
		
		objs[0].move();
		objs[0].hunt();
		
		objs[1].move();
		objs[1].hunt();
		
		objs[2].move();
		objs[2].hunt();
		
		System.out.println();

		//�������� �̿��� �޼����� �Ű�����
		move(t);
		move(e);
		move(s);
	}
	
	public static void move(Animal a) {
		a.move();
	}
}
