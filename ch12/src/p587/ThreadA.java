package p587;

public class ThreadA extends Thread {
	
	public ThreadA() {
		setName("Thread A");
	}
	
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
