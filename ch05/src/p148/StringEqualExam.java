package p148;

public class StringEqualExam {
	public static void main(String[] args) {
		String var1="�Ź�ö";
		String var2="�Ź�ö";
		
		if(var1==var2) {
			System.out.println("var1 �� var2 �� ������ ����");
		} else {
			System.out.println("var1 �� var2 �� ������ �ٸ�");
		}
		
		if(var1.equals(var2)) {
			System.out.println("var1 �� var2 �� ���ڿ��� ����");
		}
		
		String var3 = new String("LJY");
		String var4 = new String("LJY");
		
		if(var3==var4) {
			System.out.println("var3 �� var4 �� ������ ����");
		} else {
			System.out.println("var3 �� var4 �� ������ �ٸ�");
		}
		
		if(var3.equals(var4)) {
			System.out.println("var3 �� var4 �� ���ڿ��� ����");
		} else {
			System.out.println("var3 �� var4 �� ���ڿ��� �ٸ�");
		}
	}
}
