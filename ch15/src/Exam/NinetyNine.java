package Exam;

public class NinetyNine {
	public static void main(String[] args) {
		
		for(int i=9 ; i>=0; i--) {
			if(i==0) {
				System.out.println("���̻� ���忡 ���ְ� ����, ���̻� ���ִ� ���ٳ�.");
				System.out.println("���Կ� ���� �� ��Գ�, 9���� ���ְ� ���忡 �ֳ�.");
			} else {
				System.out.println("���忡 " +i+ "���� ���ְ� �ִٳ�, " +i+ "���� ���ֶ��");
				System.out.print("�ϳ��� ������ �Ѱ��־���, ");
				System.out.println((i-1) + "���� ���ְ� ���忡 �ֳ�.");
			}
		} 
	}
}