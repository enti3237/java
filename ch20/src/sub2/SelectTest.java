package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) throws Exception {

		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String name = "ljy";
		String pass = "1234";

		// JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");

		// 데이터베이스 접속
		Connection con = DriverManager.getConnection(host, name, pass);

		// 객체 생성
		Statement stm = con.createStatement();

		// SQL 실행
		String sql = "SELECT * FROM `USER3`; ";
		// stm.executeUpdate(sql);  이거 아님
		ResultSet rs = stm.executeQuery(sql);
		
		// SELECT 실행 - next 명령 : 한칸씩 내려감 - getString(컬럼숫자)
		while(rs.next()) {
			
			System.out.println("================");
			System.out.println("아이디: " +rs.getString(1));
			System.out.println("이름: " +rs.getString(2));
			System.out.println("휴대폰: " +rs.getString(3));
			System.out.println("나이: " +rs.getString(4));

//			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) );
		}
		
		// 데이터베이스 종료
		rs.close();
		stm.close();
		con.close();

	}

}
