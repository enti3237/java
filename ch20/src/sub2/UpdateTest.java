package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2019-10-31
 * �̸� : ������
 * ���� : �����ͺ��̽� ���α׷���
 */
public class UpdateTest {
	
	public static void main(String[] args) throws Exception {
		
		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String name = "ljy";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
				
		// 2�ܰ� - �����ͺ��̽� ����
		Connection con = DriverManager.getConnection(host, name, pass);
		
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = con.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql = "UPDATE `USER3` SET `hp` = '010-1234-5678' WHERE `uid` = 'b101'; ";
		stmt.executeUpdate(sql);
		
		// 5�ܰ� - SELECT ����� ó��
		// 6�ܰ� - �����ͺ��̽� ����
		
		con.close();
		System.out.println("UPDATE �Ϸ�.");
		
	}
}
