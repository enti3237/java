package sub1;

/*
 * ��¥ : 2019-10-11
 * �̸� : ������
 * ���� : ���ǹ� �ǽ��ϱ� ���� P.108
 */

public class ConditionTest {
	public static void main(String[] args) {
		
		//if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		} // if(�� ���� ����)Ʋ�� ��� ���� �Ʒ��� ���������ʴ´�
		
		// ��ø if
		if(num1>0) {
			if(num2>1) {
				System.out.println("num1�� 0���� ũ�� sum2�� 1���� ũ��");
			}
		}
		
		if(num1 > 0 && num2 >1) {
			System.out.println("num1�� 0���� ũ�� sum2�� 1���� ũ��");
		}
		
		//if~else if~else
		int n1=1, n2=2, n3=3, n4=4;
		
		if(n1>n2) {
			System.out.println("n1�� n2���� ũ��.");
			
		}else if(n2>n3) {
			System.out.println("n2�� n3���� ũ��.");
			
		}else if(n3>n4) {
			System.out.println("n3�� n4���� ũ��.");
			
		}else {
			System.out.println("n4�� ���� ũ��.");
		}
		
		//switch
		String fruit = "apple";
		
		switch(fruit) {
			case "banana":
				System.out.println("�ٳ����Դϴ�.");
				break;
			case "orange":
				System.out.println("�������Դϴ�.");
				break;
			case "apple":
				System.out.println("����Դϴ�.");
				break;
			case "grape":
				System.out.println("�����Դϴ�.");
				break;
			default:		
				System.out.println("�� �� �����ϴ�.");
				break;
		}
		
		int xai = (int)(Math.random()*6)+1;
		
		switch(xai) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		default:
			System.out.println("6���� ���Խ��ϴ�.");
			break;
			
		}
		
		int time = (int)(Math.random()*10)+7;
		System.out.println("[����ð�: " +time+ "��]");
		
		switch(time) {
		case 7:
			System.out.println("�Ͼ��");
		case 8:
			System.out.println("�Ͼ���");
		case 9:
			System.out.println("�Ͼ��ϱ�");
		case 10:
			System.out.println("�� �ڶ�");
		}
		System.out.println("���α׷� ����...");		
	}
}
