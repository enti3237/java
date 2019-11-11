package p478;

import java.util.Objects;

public class HashExam {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Miki");
		Student s2 = new Student(1, "Miki");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}

	static class Student {
		int sno;
		String name;

		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}
