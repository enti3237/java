package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2019-10-31
 * 이름 : 이지영
 * 내용 : 데이터베이스 프로그래밍
 */
public class DatabaseTest {
	public static void main(String[] args)  throws Exception {

		// DB 정보
		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String name = "ljy";
		String pass = "1234";		
		
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
			
		// 2단계 - 데이터베이스 접속
		Connection con = DriverManager.getConnection(host, name, pass);
		
		if(con != null) {
			System.out.println("데이터베이스 접속 성공!");
		}
		
		// 3단계 - SQL 실행객체 생성
		// 4단계 - SQL 실행
		// 5단계 - SELECT 결과셋 처리 (선택)
		// 6단계 - 데이터베이스 종료

		con.close();
	
	}
}
