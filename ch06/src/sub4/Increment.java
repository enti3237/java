package sub4;

public class Increment {
	public int num1;
	public static int num2;
	
	public Increment() {
		this.num1++;
		this.num2++;
		
		System.out.println("num1 : " +num1);
		System.out.println("num2 : " +num2);
	}

	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void add() {
		/* num1++; 이것도 안됨 */
		// static 메서드에서는 non-static 변수를 참조할 수 없다.		
		num2++;
	}
}
