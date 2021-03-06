package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2019-11-05
 * 이름 : 이지영
 * 내용 : 파일 입출력 스트림 실습하기 교재 p1018
 */
public class FileIOTest {

	public static void main(String[] args) throws Exception {

		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";

		// 입력스트림 생성 및 파일 연결
		FileInputStream fis = new FileInputStream(file1);

		// 출력스트림 생성 및 파일 연결
		FileOutputStream fos = new FileOutputStream(file2);
		
		
		
		// 반복문을 통한 데이터 읽어들이기
		while (true) { // while문에 true가 들어가면 if에 반드시 break가 들어간다

			int data = fis.read(); // 데이터는 문자지만 0과 1로 이루어진 이진수문법

			if (data == -1) {
				break;
			}

			// 단순출력			
//			char ch = (char)data;
//			System.out.print(ch);
			
			// 출력스트림으로 데이터 쓰기
			fos.write(data);

		}

		// 입력스트림 해제
		fis.close();
		fos.close();
		
		System.out.println("스트림 작업 종료");

	}
}
