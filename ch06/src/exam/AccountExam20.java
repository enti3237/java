package exam;
import java.util.Scanner;

public class AccountExam20 {
		private static Account20[] accountArray = new Account20[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("=========================================");
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("=========================================");
				System.out.println("����> ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount();
				} else if(selectNo == 2) {
					accountList();
				} else if(selectNo == 3) {
					deposit();
				} else if(selectNo == 4) {
					withdraw();
				} else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("���α׷� ����");
		}
		
		//���� �����ϱ�
		private static void createAccount() {
			
			System.out.println("------");
			System.out.println("���»���");
			System.out.println("------");
			System.out.println("���¹�ȣ : ");
			System.out.println("������ : " );
			System.out.println("�ʱ��Աݾ�  : " );
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		}
		
		//���¸�Ϻ���
		private static void accountList() {
			//������ ���ÿ�
		}
		
		//�����ϱ�
		private static void deposit() {
			//������ ���ÿ�
		}
		
		//����ϱ�
		private static void withdraw() {
			//������ ���ÿ�
		}
		
		//Account �迭���� ano�� ������ Account ��ü ã��
		private static Account findAccount(String ano) {
			//������ݸ޼ҵ忡�� ȣ���ؼ� �̿��� ��
			
		}
}
