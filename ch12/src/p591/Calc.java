package p591;

public class Calc {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// ������ �޸𸮿� ���� �����ϴ� �޼ҵ�
	// ����ȭ(synchronized)�� ��Ű�� ���� �� ��ü�� ��� �����带 ������ ������ �޸� �ʵ尡 ����
	public synchronized void setMemory(int memory) throws Exception {
		this.memory = memory;
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	} // Thread.currentThread().getName() ��ü�� �������� �̸� �ҷ����� ����
}
