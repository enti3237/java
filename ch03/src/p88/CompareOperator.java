package p88;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2);
		boolean rs2 = (num1 != num2);
		boolean rs3 = (num1 <= num2);
		System.out.println("rs1 = "+rs1);
		System.out.println("rs2 = "+rs2);
		System.out.println("rs3 = "+rs3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean rs4 = (char1<char2);
		System.out.println("rs4 = "+rs4);
	}

}
