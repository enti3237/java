package p290;

public class Cellphone {
	//�ʵ�
	protected String model;
	protected String color;

	//������
	
	//�޼ҵ�
	protected void powerOn() {System.out.println("������ �մϴ�.");}
	protected void powerOff() {System.out.println("������ ���ϴ�.");}
	protected void bell() {System.out.println("���� �︳�ϴ�.");}
	protected void sendVoice(String message) {System.out.println("�ڱ� : "+message);}
	protected void receiveVoice(String message) {System.out.println("���� : "+message);}
	protected void hangup() {System.out.println("��ȭ�� �����ϴ�.");}

}
