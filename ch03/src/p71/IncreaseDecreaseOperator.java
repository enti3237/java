package p71;

public class IncreaseDecreaseOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++;
		++x;
		System.out.println("x="+x); // 10+1+1=12

		System.out.println("----------------------");
		y--;
		--y;
		System.out.println("y="+y); // 10-1-1=8
		
		System.out.println("----------------------");
		z=x++;
		System.out.println("z="+z); // z=12
		System.out.println("x="+x); // 위의 계산을 한 후 x+1이 되어서 x=13
		
		System.out.println("----------------------");
		z=++x;
		System.out.println("z="+z); // z=14
		System.out.println("x="+x); // 위에서 이미 x=13+1을 계산함
		
		System.out.println("----------------------");
		z=++x + y++;
		System.out.println("z="+z); // z=(14+1)+(8)=23
		System.out.println("x="+x); // x=15 (위의 식에서 이미 계산됨)
		System.out.println("y="+y); // y=9 (위의 식의 계산을 끝낸 후 +1함)
		

		
	}

}
