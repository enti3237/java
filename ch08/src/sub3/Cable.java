package sub3;

public class Cable implements Socket {

	// 필드 생성
	private Bulb bulb;

	// 생성자 - 이거 왜 벌브벌브지  = int a랑 같은 개념이군
	public Cable (Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

}
