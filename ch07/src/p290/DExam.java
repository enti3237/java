package p290;

public class DExam {
	public static void main(String[] args) {
		//DmbCellphone �� ��ü ����
		DmbCellphone dcp = new DmbCellphone("�ڹ���", "BLACK", 10);
		
		//Cellphone���� ��ӹ��� �ʵ�
		System.out.println("Model : " +dcp.model);
		System.out.println("Color : " +dcp.color);
		//Dmb���� ��ӹ��� �ʵ�
		System.out.println("Channel : " +dcp.channel);
		System.out.println();
		
		//Cell���� ��ӹ��� �޼ҵ� ȣ��
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("Hello.");
		dcp.receiveVoice("Hello, This is Hong.");
		dcp.sendVoice("Are you kidding?");
		dcp.hangup();
		System.out.println();
		
		//Dmb���� ��ӹ��� �޼ҵ� ȣ��
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
