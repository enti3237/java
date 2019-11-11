package p512;

public class StringSplitExam {
	public static void main(String[] args) {
		
		String txt = "Miki&Leni&Paul&Team-Laon";
		
		String[] names = txt.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
