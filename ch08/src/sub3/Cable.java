package sub3;

public class Cable implements Socket {

	// �ʵ� ����
	private Bulb bulb;

	// ������ - �̰� �� ���������  = int a�� ���� �����̱�
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
