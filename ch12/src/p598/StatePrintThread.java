package p598;

public class StatePrintThread extends Thread {
	
	private Thread tgt;
	
	public StatePrintThread(Thread tgt) {
		this.tgt = tgt;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state =  tgt.getState();	//스레드 상태 얻기
			System.out.println("스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) {			//객체생성상태일 경우 실행대기상태로 만듬
				tgt.start();
			}
			if(state == Thread.State.TERMINATED) {	//종료상태일 경우 while문을 종료함
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
