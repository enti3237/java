package p299;

public class SuperAir extends Air {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행중");
		} else {
			//Air 객체의 메소드 호출
			super.fly();
		}
	}
}
