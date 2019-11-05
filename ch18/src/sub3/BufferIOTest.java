package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOTest {

	public static void main(String[] args) throws Exception {

		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";

		// 입출력스트림 생성 및 파일 연결
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		// 버퍼스트림 생성 및 파일 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 반복문을 통한 데이터 읽어들이기
		while (true) { // while문에 true가 들어가면 if에 반드시 break가 들어간다

			int data = bis.read(); // 데이터는 문자지만 0과 1로 이루어진 이진수문법

			if (data == -1) {
				break;
			}
			
			// 출력스트림으로 데이터 쓰기
			bos.write(data);

		}

		// 입력스트림 해제
		fis.close();
		fos.close();
		
		System.out.println("스트림 작업 종료");

	}
}
