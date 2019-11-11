package p475;

import java.util.Comparator;
import java.util.Objects;

public class CompareExam {
	public static void main(String[] args) {

		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		int rs = Objects.compare(s1, s2, new StudentCom());
		System.out.println(rs);
		rs = Objects.compare(s1, s3, new StudentCom());
		System.out.println(rs);
	}

	static class Student {
		int sno;

		Student(int sno) {
			this.sno = sno;
		}
	}

	static class StudentCom implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o1.sno, o2.sno);
		}
	}
}
