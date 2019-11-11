package p509;

public class StringEqualsExam {
	public static void main(String[] args) {
		
		String str1 = "JAVA Programming";
		String str2 = "java programming";
		
		System.out.println(str1.equals(str2));
		
		String low = str1.toLowerCase();
		System.out.println(low);
		
		String high = str2.toUpperCase();
		System.out.println(high);
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}