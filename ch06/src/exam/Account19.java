package exam;

public class Account19 {
	//������ �ȵǰ� �ִ� �鸸�������� ����Ǵ� �ʵ�+�ܺκ��� �Ұ�
	private int balance;
	
	//�޼ҵ�
	//Getter
	public int getBalance() {
		getBalance += balance;
		return getBalance;
	}
	
	//Setter
	//�߰����� �����ų� �鸸���� �ʰ��ϸ� ���� �뷱������ ������ ��
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