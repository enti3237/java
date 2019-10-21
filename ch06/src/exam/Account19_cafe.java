package exam;

public class Account19_cafe {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance<Account19_cafe.MIN_BALANCE||
			balance>Account19_cafe.MAX_BALANCE){
			return;
		}
		this.balance = balance;
	}
}
	