package p1026;

import java.io.FileReader;

public class FileReaderExam {
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\p1026\\FileReaderExam.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo = fr.read(cbuf)) != -1 ) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}
