package p1022;

import java.io.FileInputStream;

public class FileInputStreamExam {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/Users/java/Desktop/workspace/java/ch18/src/p1022/FileInputStreamExam.java");
		int data;
		while((data=fis.read()) != -1) {
			System.out.write(data);
		}
		fis.close();
	}
}
