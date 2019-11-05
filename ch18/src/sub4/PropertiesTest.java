package sub4;

import java.io.FileReader;
import java.util.Properties;

/*
 * 날짜 : 2019-11-05
 * 이름 : 이지영
 * 내용 : 프로퍼티 컬렉션 실습하기 교재 748p
 */
public class PropertiesTest {

	public static void main(String[] args) throws Exception {

		// Properties의 기본 데이터 입출력
		Properties pro1 = new Properties();
		pro1.setProperty("101", "서울");
		pro1.setProperty("102", "대전");
		pro1.setProperty("103", "대구");
		pro1.setProperty("104", "부산");
		pro1.setProperty("105", "광주");

		System.out.println("101번 데이터 : " + pro1.getProperty("101"));
		System.out.println("104번 데이터 : " + pro1.getProperty("104"));

		// 스트림을 통한 데이터 입력
		String s1 = "C:\\Users\\java\\Desktop\\data.properties";

		FileReader fr = new FileReader(s1);

		Properties pro2 = new Properties();
		pro2.load(fr);

		System.out.println("101번 데이터 : " + pro2.getProperty("102"));
		System.out.println("105번 데이터 : " + pro2.getProperty("105"));

	}

}
