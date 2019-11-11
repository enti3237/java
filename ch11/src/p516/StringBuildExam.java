package p516;

public class StringBuildExam {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("JAVA ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("ÃÑ ¹®ÀÚ¼ö = " + length);
		
		String rs = sb.toString();
		System.out.println(rs);
		
	}

}
