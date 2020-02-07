package p1014;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExam {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		os.write(10);
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}

}
