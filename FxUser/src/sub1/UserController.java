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

	ObservableList<String> posList = FXCollections.observableArrayList("사원", "대리", "과장", "차장", "부장");
	ObservableList<String> depList = FXCollections.observableArrayList("101", "102", "103", "104", "105");

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// 콤보박스 데이터 추가
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

		// 사용자 입력정보 가져오기
		String uid = txtUid.getText();
		String name= txtName.getText();
		String hp  = txtHp.getText();
		String pos = cbPos.getValue();
		String dep = cbDep.getValue();
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.9:3306/ljy";
		String user = "ljy";
		String pass = "1234";

		// JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");

		// 데이터베이스 접속
		Connection con = DriverManager.getConnection(host, user, pass);

		// 객체 생성 (PrepareStatement) - 일단 자리를 잡고(=매핑) 데이터는 나중에 넣는다
		String sql = "INSERT INTO `MEMBER` VALUES (?, ?, ?, ?, ?, NOW());";

		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setString(4, pos);
		psmt.setString(5, dep);

		// SQL 실행
		psmt.executeUpdate();

		// SELECT 출력

		// 데이터베이스 종료
		psmt.close();
		con.close();

		JOptionPane.showMessageDialog(null, "INSERT 완료");
		System.out.println("INSERT 완료");
	}
}
