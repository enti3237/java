package p503;

public class StringGetByteExam {
	public static void main(String[] args) throws Exception {
		
		String str = "æ»≥Á«œººø‰";
		
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length);
		String str1 = new String(byte1);
		System.out.println(str1);
		
		byte[] byte2 = str.getBytes("EUC-KR");
		System.out.println(byte2.length);
		String str2 = new String(byte2);
		System.out.println(str2);
		
		byte[] byte3 = str.getBytes("UTF-8");
		System.out.println(byte3.length);
		String str3 = new String(byte3);
		System.out.println(str3);
		
	}
}
