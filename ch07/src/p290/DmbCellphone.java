package p290;

public class DmbCellphone extends Cellphone {
	//�ʵ�
	protected int channel;
	
	//������
	protected DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	protected void turnOnDmb() {
		System.out.println("ä�� " +channel+ "�� ��ۼ����� �����մϴ�.");
	}

	protected void changeChannelDmb(int channel) {
		System.out.println("ä�� " +channel+ "������ �ٲߴϴ�.");
	}
	
	protected void turnOffDmb() {
		System.out.println("DMB����� ����ϴ�.");
	}
}
