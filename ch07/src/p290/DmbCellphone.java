package p290;

public class DmbCellphone extends Cellphone {
	//필드
	protected int channel;
	
	//생성자
	protected DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	protected void turnOnDmb() {
		System.out.println("채널 " +channel+ "번 방송수신을 시작합니다.");
	}

	protected void changeChannelDmb(int channel) {
		System.out.println("채널 " +channel+ "번으로 바꿉니다.");
	}
	
	protected void turnOffDmb() {
		System.out.println("DMB방송을 멈춥니다.");
	}
}
