package p229;

public class Car {
	//�ʵ�
	private int speed;
	
	//������ - ���⼱ ��� ��...
	public Car() {
		this.speed = speed;
	}

	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	public void run() {
		for(int i=10 ; i<=50 ; i+=10){
			speed = i;
			System.out.println("�ü� "+speed+"km/h�� �޸��ϴ�.");
		}
	}

}
