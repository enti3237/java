package p598;

public class StatePrintThread extends Thread {
	
	private Thread tgt;
	
	public StatePrintThread(Thread tgt) {
		this.tgt = tgt;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state =  tgt.getState();	//������ ���� ���
			System.out.println("������ ���� : " + state);
			
			if(state == Thread.State.NEW) {			//��ü���������� ��� ��������·� ����
				tgt.start();
			}
			if(state == Thread.State.TERMINATED) {	//��������� ��� while���� ������
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
