package p220;

public class ComExam {
	public static void main(String[] args) {
		
		Com myCom = new Com();
		
		int[] values1 = {1, 2, 3};
		int rs1 = myCom.sum1(values1);
		System.out.println("rs1 : "+rs1);
		
		int rs2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("rs2 : "+rs2);
		
		int rs3 = myCom.sum2(1, 2, 3);
		System.out.println("rs3 : "+rs3);
		
		int rs4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("rs4 : "+rs4);
		
	}

}
