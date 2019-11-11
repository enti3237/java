package p499;

public class StringCharExam {
	public static void main(String[] args) {
		
		String ssn = "000000-1111111";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("Male");
			break;
		case '2' :
		case '4' :
			System.out.println("Female");
			break;
		}
	}
}
