package exam191025;
/*
 * ��¥ : 2019-10-25
 * �̸� : ������
 * ���� : �����򰡼� �򰡹��� 06-2
 */

public class Child extends Parent {
	
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name) call");
	}

}