package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2019-10-31
 * �̸� : ������
 * ���� : �����ͺ��̽� ���α׷���
 */
public class DeleteTest {

	public static void main(String[] args) {

		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String name = "ljy";
		String pass = "1234";

		Connection con = null;

		// �̷��Ե� �� �� �ֱ� �ѵ� �׳� main�� throws Exception�� ���ϰڴ�
		try {
			// JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");

			// �����ͺ��̽� ����
			con = DriverManager.getConnection(host, name, pass);

			// ��ü ����
			Statement stm = con.createStatement();

			// SQL ����
			stm.executeUpdate("DELETE FROM `USER3` WHERE `uid` = 'b101' ;");

			// �����ͺ��̽� ����
			con.close();

		} catch (Exception e) {
		}

		System.out.println("DELETE ����");

	}
}
