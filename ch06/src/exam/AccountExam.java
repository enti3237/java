package exam;

public class AccountExam {
	public static void main(String[] args) {
		Account19_cafe account = new Account19_cafe();
		
		account.setBalance(10000);
		System.out.println("���� �ܰ� : " +account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ� : " +account.getBalance());

		account.setBalance(2000000);
		System.out.println("���� �ܰ� : " +account.getBalance());

		account.setBalance(300000);
		System.out.println("���� �ܰ� : " +account.getBalance());
		
		//�ֶ����� ������ �ܰ� 30������...??
	}
}
