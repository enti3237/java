package exam;

public class Account {
	//������ �ȵǰ� �ִ� �鸸�������� ����Ǵ� �ʵ�
	//�ܺκ��� �Ұ�
	private int balance;
	
	//�޼ҵ�
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