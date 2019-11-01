package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2019-10-31
 * 이름 : 이지영
 * 내용 : 데이터베이스 프로그래밍
 */
public class DeleteTest {

	public static void main(String[] args) {

		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String name = "ljy";
		String pass = "1234";

		Connection con = null;

		// 이렇게도 할 수 있긴 한데 그냥 main에 throws Exception이 편하겠다
		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");

			// 데이터베이스 접속
			con = DriverManager.getConnection(host, name, pass);

			// 객체 생성
			Statement stm = con.createStatement();

			// SQL 실행
			stm.executeUpdate("DELETE FROM `USER3` WHERE `uid` = 'b101' ;");

			// 데이터베이스 종료
			con.close();

		} catch (Exception e) {
		}

		System.out.println("DELETE 성공");

	}
}
