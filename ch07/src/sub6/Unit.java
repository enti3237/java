package sub6;

//�߻�Ŭ���� 
//- �߻�޼��带 ���� Ŭ����
//- ����� ���� Ŭ����. �ڽ��� ��ü���� �Ұ�����
//- ����ȭ�� Ŭ���� ���踦 �����Ѵ� = �԰�ȭ
public abstract class Unit {

	public void move() {
		System.out.println("Unit move...");
	}
	
	// �߻� �޼��� ���� ( {����} �ƴ� - ������ �ڽ���... �� �̷� �θ� ��_��) 
	// �տ� abstract �ٿ��ֱ� (Ŭ��������)
	public abstract void attack();
	public abstract void special();

}
