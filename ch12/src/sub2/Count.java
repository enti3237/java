package sub2;

public class Count {

	private int num;

	public int getNum() {
		return num;
	}

	// ����ȭ �� ���� (synchronized) ���� �����尣 ����(���ÿ� ���ͼ� �ϳ��� �����ǰų� �ϴ� ����)�� ���´� 
	public synchronized void setNum() {
		this.num++;
	}

}
