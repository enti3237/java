package sub1;
/*
 * ��¥ : 2019-10-11
 * �̸� : ������
 * ���� : ���ǹ� ��������
 */

public class IfTest {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101)+0;

		if(score>=90 && score<=100) {
			System.out.println("����" +score+ "�� A�Դϴ�.");	
		}else if(score>=80 && score<90){
			System.out.println("����" +score+ "�� B�Դϴ�.");
		}else if(score>=70 && score<60) {
			System.out.println("����" +score+ "�� C�Դϴ�.");
		}else if(score>=60 && score<50) {
			System.out.println("����" +score+ "�� D�Դϴ�.");
		}else if(score>=0 && score<60) {
			System.out.println("����" +score+ "�� E�Դϴ�.");
		}else
			System.out.println("����" +score+ "�� �����Դϴ�.");
		
		
	}

}
