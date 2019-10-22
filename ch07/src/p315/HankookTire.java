package p315;

import p314.Tire;

public class HankookTire extends Tire {

	//필드 - 없음
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);		//타이어의 그것
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;			//누적회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "HankookTire 수명" +(maxRotation-accumulatedRotation)+ "회");
			return true;				//정상회전(누적회전수<최대회전수)
		} else {
			System.out.println("***" + location + "HankookTire 펑크  ***");
			return false;				//펑크(누적>최대)
		}
	}
}
