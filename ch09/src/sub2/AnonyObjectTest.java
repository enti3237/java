package sub2;
/*
 * ��¥ : 2019-10-22
 * �̸� : ������
 * ���� : �͸� Ŭ���� �ǽ��ϱ� ���� p.404
 */

public class AnonyObjectTest {
	public static void main(String[] args) {
		
		//�͸�ü - �������̽��� Ŭ���� ���� ���� new �������� ������ ����
		//new Person() {
		Person p = new Person() {
			
			@Override
			public void info() {				
				System.out.println("Person info...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
				}
		}; //�����ݷ��� �� ��������...
		
		//����� �����ϱ� ���ؼ� new Person �տ� ��ü����
		p.info();
		p.hello();
		
	}
}