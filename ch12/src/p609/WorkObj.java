package p609;

public class WorkObj {
	
	public synchronized void methodA() throws Exception {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify();			// 일시정지상태의 스레드B를 실행대기상태로 만듬
		wait();				// 스레드A를 일시정지상태로 만듬
	}
	
	public synchronized void methodB() throws Exception {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify();
		wait();
	}
}
