package p1031;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExam {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/Temp/file2.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("���������� �������ϴ�");
		
	}

}