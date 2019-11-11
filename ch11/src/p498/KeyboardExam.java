package p498;

public class KeyboardExam {
	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100];
		
		System.out.print("input : ");
		int readByteno = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteno-2);
		System.out.println(str);
	}
}
