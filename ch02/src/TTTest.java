
public class TTTest {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1));
		System.out.println(toBinaryString(v2));
		System.out.println(toBinaryString(v3));
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4));
		System.out.println(toBinaryString(v5));
		System.out.println(toBinaryString(v6));
		}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		
		return str;
	}

	}
