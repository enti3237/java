package p118;

public class SwitchNoBreakExam {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("����ð��� " + time + "���Դϴ�.");
		
		switch(time) {
		case 8 :
			System.out.println("8�ÿ� ����մϴ�.");
		case 9 :
			System.out.println("9�ÿ� ȸ�Ǹ� �մϴ�.");
		case 10 :
			System.out.println("10�ÿ� ������ ���ϴ�.");
		case 11 :
			System.out.println("11�ÿ� �ܱ��� �����ϴ�.");
		}
		
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		case 'C':
		case 'c':
			System.out.println("�մ��Դϴ�.");
			break;
		}
	}

}
