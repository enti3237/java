package exam;

public class Account {
	//음수값 안되고 최대 백만원까지만 저장되는 필드
	//외부변경 불가
	private int balance;
	
	//메소드
	//Getter
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		getBalance += balance;
		return balance;
	}
	
	//Setter

	public int getBalance = 0;
	public int MIN_BALANCE = 0;
	public int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE) {
			this.balance = getBalance;
			return;
		} if(balance>MAX_BALANCE) {
			this.balance = balance;
			} else {
				}
	}
}