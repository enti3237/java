package p295;

import p294.Student;

public class PSExam {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", "123456-1234567", 1);
		//Student의 부모 People에게 물려받은 필드출력
		System.out.println("name: " +stu.name);
		System.out.println("ssn: " +stu.ssn);
		System.out.println("studentNo: " +stu.studentNo);
	}

}
