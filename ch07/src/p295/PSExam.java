package p295;

import p294.Student;

public class PSExam {
	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", "123456-1234567", 1);
		//Student�� �θ� People���� �������� �ʵ����
		System.out.println("name: " +stu.name);
		System.out.println("ssn: " +stu.ssn);
		System.out.println("studentNo: " +stu.studentNo);
	}

}
