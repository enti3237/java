package p507;

public class StringSubstringExam {
	public static void main(String[] args) {
		
		String ssn = "879654-1234567";
		
		String no1 = ssn.substring(0,6);
		System.out.println(no1);
		
		String no2 = ssn.substring(8);
		System.out.println(no2);
	}
}