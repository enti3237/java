package p609;

public class WorkObj {
	
	public synchronized void methodA() throws Exception {
		System.out.println("ThreadA�� methodA() �۾�����");
		notify();			// �Ͻ����������� ������B�� ��������·� ����
		wait();				// ������A�� �Ͻ��������·� ����
	}
	
	public synchronized void methodB() throws Exception {
		System.out.println("ThreadB�� methodB() �۾�����");
		notify();
		wait();
	}
}
