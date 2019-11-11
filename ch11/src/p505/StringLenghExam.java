package p505;

public class StringLenghExam {
	public static void main(String[] args) {
		
		String ssn = "1111112222222";
		int length = ssn.length();
		if(length==13) {
			System.out.println("OK");
		} else {
			System.out.println("Failed");
		}
	}
}
