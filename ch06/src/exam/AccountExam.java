package exam;

public class AccountExam {
	public static void main(String[] args) {
		Account19_cafe account = new Account19_cafe();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " +account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " +account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고 : " +account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고 : " +account.getBalance());
		
		//왜때문에 마지막 잔고가 30만이지...??
	}
}
