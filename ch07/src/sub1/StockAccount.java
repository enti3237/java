package sub1;

public class StockAccount extends Account{
	
	//Ư��(�������=�ʵ�)
	private String stock;
	private int amount;
	private int stockprice;
	
	//������
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockprice) {
		super(bank, id, name, money); // �θ� Ŭ������ ������ ����+�ڽ��� �ʵ� ���� �߰�
		
		this.stock = stock;
		this.amount = amount;
	}

	//���(����޼���)
	public void sell(int amount) {
		this.amount -= amount;
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	public void info() {
		super.info();
		System.out.println("�ֽ����� : " +stock);
		System.out.println("�ֽİ��� : " +stockprice);
		System.out.println("�ֽļ��� : " +amount);
	}

}
