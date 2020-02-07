package p1024;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExam {
	public static void main(String[] args) throws Exception{
		
		String originalFineName = "C:\\Users\\java\\Desktop\\Joker.jpg";
		String targetFileName = "C:/Temp/house.jpg";
		
		FileInputStream fis = new FileInputStream(originalFineName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
	}

}
