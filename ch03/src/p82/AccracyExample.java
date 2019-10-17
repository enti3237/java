package p82;

public class AccracyExample {
	public static void main(String[] args) {
		
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double n2 = number/10.0;
		double rs2 = temp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println(n2+ "조각을 빼면");
		System.out.println(rs2+ "조각이 남는다");
		
	}

}
