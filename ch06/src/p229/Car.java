package p229;

public class Car {
	//필드
	private int speed;
	
	//생성자 - 여기선 없어도 됨...
	public Car() {
		this.speed = speed;
	}

	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	public void run() {
		for(int i=10 ; i<=50 ; i+=10){
			speed = i;
			System.out.println("시속 "+speed+"km/h로 달립니다.");
		}
	}

}
