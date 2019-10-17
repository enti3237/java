package p69;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int rs1 = +x; //더하기 빼기를 왜 ++ -- 로 쓰나 했더니 양수음수 표시를 하려고 해서였군!
		int rs2 = -x;
		System.out.println("rs1 ="+rs1);
		System.out.println("rs2 ="+rs2);
		
		short s = 100;
		//short rs3 = -s; //에러남 
		int rs3 = -s;
		System.out.println("rs3 ="+rs3);
	}

}
