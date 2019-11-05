package sub1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UserController implements Initializable {

	@FXML	private TextField txtUid;
	@FXML	private TextField txtName;
	@FXML	private TextField txtHp;
	@FXML	private ComboBox<String> cbPos;
	@FXML	private ComboBox<String> cbDep;
	@FXML	private Button btnRegi;

	ObservableList<String> posList = FXCollections.observableArrayList("���", "�븮", "����", "����", "����");
	ObservableList<String> depList = FXCollections.observableArrayList("101", "102", "103", "104", "105");

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// �޺��ڽ� ������ �߰�
		cbPos.setItems(posList);
		cbDep.setItems(depList);

		btnRegi.setOnAction(event -> {
			try {
				btnRegiClick();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	} // initialize end

	public void btnRegiClick() throws Exception {

		// ����� �Է����� ��������
		String uid = txtUid.getText();
		String name= txtName.getText();
		String hp  = txtHp.getText();
		String pos = cbPos.getValue();
		String dep = cbDep.getValue();
		
		// DB����
		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String user = "ljy";
		String pass = "1234";

		// JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// �����ͺ��̽� ����
		Connection con = DriverManager.getConnection(host, user, pass);

		// ��ü ���� (PrepareStatement) - �ϴ� �ڸ��� ���(=����) �����ʹ� ���߿� �ִ´�
		String sql = "INSERT INTO `MEMBER` VALUES (?, ?, ?, ?, ?, NOW());";

		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setString(4, pos);
		psmt.setString(5, dep);

		// SQL ����
		psmt.executeUpdate();

		// SELECT ���

		// �����ͺ��̽� ����
		psmt.close();
		con.close();

		JOptionPane.showMessageDialog(null, "INSERT �Ϸ�");
		System.out.println("INSERT �Ϸ�");
	}
}
