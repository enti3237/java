package p267;

public class Car {
	//�ʵ� - �ܺ����ٺҰ�
	private int speed;
	private boolean stop;
	
	//������
	
	//�޼ҵ� - ���� ���ٰ���
	public int getSpeed() {
		return speed;
	}
	//��Ʈ���� ������ ��� speed �ʵ忡 0���� �����ϰ� �޼ҵ� ����
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public double getSpeed1() {
		double km = speed*1.6;
		return km;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
