package p267;

public class Car {
	//필드 - 외부접근불가
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드 - 전부 접근가능
	public int getSpeed() {
		return speed;
	}
	//인트값이 음수일 경우 speed 필드에 0으로 저장하고 메소드 종료
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
