package p1027;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExam {
	public static void main(String[] args) throws Exception {
		
		File file = new File("c:/Temp/file1.txt");
		
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter�� �ѱ۷� ��" + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�" + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("���Ͽ�����Ǿ����ϴ�");
		
		
	}

}
