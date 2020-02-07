package p1040;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExam {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
		PrintStream ps = new PrintStream(fos);
	
		ps.println("프린터 보조 스트림");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다. 어라 날아가네 'ㅇ'");
	}

}
