package sub2;

/*
 * ��¥ : 2019-10-10
 * �̸� : ������
 * ���� : 
 */

public class DataTypeTest { // Ŭ�����̸��� ����빮�ڷ� ����
	
	public static void main(String[] args) {

		// Ÿ������ : ������ int
		byte  var1 = 127; // Ÿ���� ���� ������ �ʿ䰡 ����. �����̸��� �ҹ��ڷ� ����
		short var2 = 32767; // int ���� �������� �� �� �� ������
		int   var3 = 2147483647; // ������ �Ʒ��� ������ ũ�� �������. 8����Ʈ.
		long  var4 = 9999999999999999L; // ���� �ڿ� L�ٿ�����. 16����Ʈ�� ���ſ��� �� ��
		
		// �Ǽ��� double
		float  var5 = 1.123456789f; // �Ҽ��� 7�ڸ������� ��µǴµ� �ڿ� f�� �ٿ����ؼ� �� �� ��
		double var6 = 1.1234567890123456789; // �Ҽ��� 16�ڸ�����

		// ���� boolean
		boolean var7 = true;
		boolean var8 = false;
		
		// ������ char
		char ch1 = 'A'; // �� �ѱ��ڸ� �� �� �־ ���� ȿ�뼺�� ���� ������
		char ch2 = '��'; // ������ �̰� ��µ� �ȵǰ���-���ݾ�-�ڹٴ� �����ڵ带 ���⿡ 2����Ʈ ����... ������ Aa�� �ȵ�
		
		// ���ڿ� String
		String str1 = "A"; // char�� '��������ǥ'��, String�� "ū����ǥ"��
		String str2 = "Apple";
		String str3 = "���";
		
		int     a1 = 134;
		double  a2 = 1.34;
		boolean a3 = false;
		String  a4 = "risky";
		
		System.out.println(+a1);
		System.out.println(+a2);
		System.out.println(a3); //+�� ������ �ʰų�...
		System.out.println(""+a4); //"" �� �ٿ��� �Ѵ� ����...
		
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("str3 : "+str3);
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);

				
	}

}
