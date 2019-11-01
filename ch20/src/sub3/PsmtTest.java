package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * 날짜 : 2019-10-31
 * 이름 : 이지영
 * 내용 : Prepare Statement 실습하기
 */
public class PsmtTest {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("============================");
			System.out.println("사용자 등록입니다. 종료 : 0 / 등록 : 1");
			System.out.print("입력 : ");

			int result = sc.nextInt();

			if (result == 0) {
				break;
			}
			System.out.println("아이디 입력: ");
			String uid = sc.next();

			System.out.println("이름 입력: ");
			String name = sc.next();

			System.out.println("휴대폰 입력: ");
			String hp = sc.next();

			System.out.println("나이 입력: ");
			int age = sc.nextInt();

			insert(uid, name, hp, age);

		} while (true);

		System.out.println("종료했습니다.");

	} // main END

	
	public static void insert(String uid, String name, String hp, int age) throws Exception {

		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String user = "ljy";
		String pass = "1234";

		// JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");

		// 데이터베이스 접속
		Connection con = DriverManager.getConnection(host, user, pass);

		// 객체 생성 (PrepareStatement) - 일단 자리를 잡고(=매핑) 데이터는 나중에 넣는다
		String sql = "INSERT INTO `USER2` VALUES (?, ?, ?, ?);";

		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setInt(4, age);

		// SQL 실행
		psmt.executeUpdate();

		// SELECT 출력

		// 데이터베이스 종료
		psmt.close();
		con.close();

		System.out.println("INSERT 완료");

	}
}
