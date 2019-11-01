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

		// JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// �����ͺ��̽� ����
		Connection con = DriverManager.getConnection(host, name, pass);

		// ��ü ����
		Statement stm = con.createStatement();

		// SQL ����
		String sql = "SELECT * FROM `USER3`; ";
		// stm.executeUpdate(sql);  �̰� �ƴ�
		ResultSet rs = stm.executeQuery(sql);
		
		// SELECT ���� - next ��� : ��ĭ�� ������ - getString(�÷�����)
		while(rs.next()) {
			
			System.out.println("================");
			System.out.println("���̵�: " +rs.getString(1));
			System.out.println("�̸�: " +rs.getString(2));
			System.out.println("�޴���: " +rs.getString(3));
			System.out.println("����: " +rs.getString(4));

//			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) );
		}
		
		// �����ͺ��̽� ����
		rs.close();
		stm.close();
		con.close();

	}

}
