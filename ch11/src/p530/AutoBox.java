package p530;

public class AutoBox {
	public static void main(String[] args) {
		
		//�ڵ��ڽ�
		Integer o1 = 100;
		System.out.println("value: " +o1.intValue());
		
		//���Խ� �ڵ� ��ڽ�
		int value = o1;
		System.out.println("value: " +value);
		
		//����� �ڵ� ��ڽ� - Integer�� �ڽ��� ����(��ü�� ��)�� ��Ʈ ����Ŀ� �־ �ڵ����� ��ȯ��
		int rs = o1 + 100;
		System.out.println("rs: " +rs);
		
		
	}

}
