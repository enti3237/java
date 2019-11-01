package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2019-10-31
 * 이름 : 이지영
 * 내용 : 데이터베이스 프로그래밍
 */
public class InsertTest {

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

		// 4단계 - SQL 실행 - ; 잘 찍으시오 내부에도 있는 거 잊지말기...
		String sql = "INSERT INTO `USER3` VALUES('b101', '정약용', '010-2222-1111', 34);";
		stmt.executeUpdate(sql);

		// 5단계 - SELECT 결과셋 처리
		// 6단계 - 데이터베이스 종료
		con.close();

		System.out.println("INSERT 완료.");

	}
}
