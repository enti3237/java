package sub1;

public class Smartphone extends Computer {

	//�ʵ�
	private String brand;
	private String tel;
	private int price;
	
	//������
	public Smartphone(
			String cpu, 
			String ram, 
			String hdd, 
			String brand, 
			String tel, 
			int price) {
		super(cpu, ram, hdd);
		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}
	
	
	//����
	public void call() {
		System.out.println(tel+ " ��ȣ�� ��ȭ �Ŵ� ��...");
	}
	public void info() {
		/* super.info(); */
		/* protected�� ������ ������ �ڽ�Ŭ������ ����� ���� ���� */
		System.out.println("CPU : " + cpu);
		System.out.println("��ǰ��  : " +brand);
		System.out.println("����ȣ  : " +tel);
		System.out.println("��ǰ����: " +price);
	}
	
}
