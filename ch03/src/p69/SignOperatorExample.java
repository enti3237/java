package p69;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int rs1 = +x; //���ϱ� ���⸦ �� ++ -- �� ���� �ߴ��� ������� ǥ�ø� �Ϸ��� �ؼ�����!
		int rs2 = -x;
		System.out.println("rs1 ="+rs1);
		System.out.println("rs2 ="+rs2);
		
		short s = 100;
		//short rs3 = -s; //������ 
		int rs3 = -s;
		System.out.println("rs3 ="+rs3);
	}

}
