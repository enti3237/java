package p148;

public class StringEqualExam {
	public static void main(String[] args) {
		String var1="신민철";
		String var2="신민철";
		
		if(var1==var2) {
			System.out.println("var1 과 var2 는 참조가 같음");
		} else {
			System.out.println("var1 과 var2 는 참조가 다름");
		}
		
		if(var1.equals(var2)) {
			System.out.println("var1 과 var2 는 문자열이 같음");
		}
		
		String var3 = new String("LJY");
		String var4 = new String("LJY");
		
		if(var3==var4) {
			System.out.println("var3 과 var4 는 참조가 같음");
		} else {
			System.out.println("var3 과 var4 는 참조가 다름");
		}
		
		if(var3.equals(var4)) {
			System.out.println("var3 과 var4 는 문자열이 같음");
		} else {
			System.out.println("var3 과 var4 는 문자열이 다름");
		}
	}
}
