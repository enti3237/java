package sub2;
/*
 * ��¥ : 2019-10-17
 * �̸� : ������
 * ���� : Ŭ���� ��� �ǽ��ϱ�
 */
public class Inherit {
	public static void main(String[] args) {
		Person p1 = new Person("������", 25);
		Student s1 = new Student("������", 21, "�λ���б�", "�İ���");
		SalaryStudent ss1 = new SalaryStudent("�̼���", 22, "�λ�ܴ�", "�ڹپ�", "����");

		p1.hello();
		System.out.println("=============");
		s1.hello();
		System.out.println("=============");
		ss1.hello();
	}

}
