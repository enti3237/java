package sub2;

public class Count {

	private int num;

	public int getNum() {
		return num;
	}

	// 동기화 블럭 선언 (synchronized) 으로 스레드간 경합(동시에 들어와서 하나가 누락되거나 하는 사태)을 막는다 
	public synchronized void setNum() {
		this.num++;
	}

}
