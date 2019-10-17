package p207;

public class KoreanExam {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "818181-2121211");
		Korean k2 = new Korean("김자바", "123456-1234567");
		
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		System.out.println();
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);
	}

}
