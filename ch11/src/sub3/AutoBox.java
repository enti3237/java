package sub3;
/*
 * ��¥ : 2019-10-23
 * �̸� : ������
 * ���� : AutoBox, AutoUnbox �ǽ��ϱ� ���� p.527
 */
public class AutoBox {
	public static void main(String[] args) {
		
		//AutoBoxing
		Boolean box1 = false;
		Integer box2 = 2;
		Double  box3 = 3.14;
		
		//AutoUnboxing
		boolean ubx1 = box1;
		int	    ubx2 = box2;
		double  ubx3 = box3;
		
		System.out.println("ubx1 : " +ubx1);
		System.out.println("ubx2 : " +ubx2);
		System.out.println("ubx3 : " +ubx3);
				
				
	}

}
