package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * ��¥ : 2019-10-31
 * �̸� : ������
 * ���� : Prepare Statement �ǽ��ϱ�
 */
public class PsmtTest {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("============================");
			System.out.println("����� ����Դϴ�. ���� : 0 / ��� : 1");
			System.out.print("�Է� : ");

			int result = sc.nextInt();

			if (result == 0) {
				break;
			}
			System.out.println("���̵� �Է�: ");
			String uid = sc.next();

			System.out.println("�̸� �Է�: ");
			String name = sc.next();

			System.out.println("�޴��� �Է�: ");
			String hp = sc.next();

			System.out.println("���� �Է�: ");
			int age = sc.nextInt();

			insert(uid, name, hp, age);

		} while (true);

		System.out.println("�����߽��ϴ�.");

	} // main END

	
	public static void insert(String uid, String name, String hp, int age) throws Exception {

		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String user = "ljy";
		String pass = "1234";

		// JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// �����ͺ��̽� ����
		Connection con = DriverManager.getConnection(host, user, pass);

		// ��ü ���� (PrepareStatement) - �ϴ� �ڸ��� ���(=����) �����ʹ� ���߿� �ִ´�
		String sql = "INSERT INTO `USER2` VALUES (?, ?, ?, ?);";

		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setInt(4, age);

		// SQL ����
		psmt.executeUpdate();

		// SELECT ���

		// �����ͺ��̽� ����
		psmt.close();
		con.close();

		System.out.println("INSERT �Ϸ�");

	}
}
