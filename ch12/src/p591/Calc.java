package p591;

public class Calc {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// 계산기의 메모리에 값을 저장하는 메소드
	// 동기화(synchronized)를 시키면 먼저 들어간 객체가 모든 스레드를 실행할 때까지 메모리 필드가 잠긴다
	public synchronized void setMemory(int memory) throws Exception {
		this.memory = memory;
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	} // Thread.currentThread().getName() 전체가 스레드의 이름 불러오는 공식
}
