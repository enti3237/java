package p245;

public class PersonExam {
	public static void main(String[] args) {
		Person p1 = new Person("123456-7890112", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "을지문덕";
	}

}
