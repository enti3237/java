package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2019-10-31
 * 이름 : 이지영
 * 내용 : 데이터베이스 프로그래밍
 */
public class UpdateTest {
	
	public static void main(String[] args) throws Exception {
		
		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String name = "ljy";
		String pass = "1234";
		
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
				
		// 2단계 - 데이터베이스 접속
		Connection con = DriverManager.getConnection(host, name, pass);
		
		// 3단계 - SQL 실행객체 생성
		Statement stmt = con.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "UPDATE `USER3` SET `hp` = '010-1234-5678' WHERE `uid` = 'b101'; ";
		stmt.executeUpdate(sql);
		
		// 5단계 - SELECT 결과셋 처리
		// 6단계 - 데이터베이스 종료
		
		con.close();
		System.out.println("UPDATE 완료.");
		
	}
}
