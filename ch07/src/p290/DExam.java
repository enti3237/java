package p290;

public class DExam {
	public static void main(String[] args) {
		//DmbCellphone 의 객체 생성
		DmbCellphone dcp = new DmbCellphone("자바폰", "BLACK", 10);
		
		//Cellphone에서 상속받은 필드
		System.out.println("Model : " +dcp.model);
		System.out.println("Color : " +dcp.color);
		//Dmb에서 상속받은 필드
		System.out.println("Channel : " +dcp.channel);
		System.out.println();
		
		//Cell에서 상속받은 메소드 호출
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("Hello.");
		dcp.receiveVoice("Hello, This is Hong.");
		dcp.sendVoice("Are you kidding?");
		dcp.hangup();
		System.out.println();
		
		//Dmb에서 상속받은 메소드 호출
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
