package p1040;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExam {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
		PrintStream ps = new PrintStream(fos);
	
		ps.println("������ ���� ��Ʈ��");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�. ��� ���ư��� '��'");
	}

}
