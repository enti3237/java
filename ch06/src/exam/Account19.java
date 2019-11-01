package exam;

public class Account19 {
	//음수값 안되고 최대 백만원까지만 저장되는 필드+외부변경 불가
	private int balance;
	
	//메소드
	//Getter
	public int getBalance() {
		getBalance += balance;
		return getBalance;
	}
	
	//Setter
	//추가값이 음수거나 백만원을 초과하면 현재 밸런스값을 유지할 것
	public int getBalance = 0;
	public int MIN_BALANCE = 0;
	public int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		this.balance = balance;
		if(balance<=MIN_BALANCE) {
			this.balance = 0;
			return;
		} if(balance>=MAX_BALANCE) {
			this.balance = 0;
			return;
			} else {
				}
	}
}