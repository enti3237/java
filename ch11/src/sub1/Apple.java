package sub1;

public class Apple {
	//public class Apple extends Object
	//�ڹ��� ��� Ŭ������ Object�� ��ӹ޴´�. �ڹ��� �ֻ���Ŭ����. extends ǥ�� ��������.
	
	//�ʵ�
	private String country;
	private int price; 
	
	//������
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	//�޼ҵ�
	public void info() {
		System.out.println("������: " +country);
		System.out.println("��   ��: " +price);
	}

}
