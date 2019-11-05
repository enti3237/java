package sub1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayerController implements Initializable {

	@FXML private Button btnLogin;
	@FXML private Button btnCancel;
	@FXML private TextField txtUid;
	@FXML private TextField txtPass;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 이벤트 핸들러(처리자) 구현 
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				String uid = txtUid.getText();
				String pass = txtPass.getText();
				
				if(uid.equals("hong") && pass.equals("1234")) {
					System.out.println(uid + "님 반갑습니다.");
				} else {
					System.out.println("로그인에 실패하였습니다.");
				}
				
			}
		}); // 로긴 버튼을 누르면 액션을 실행하라는 명령
		
		// 람다식을 이용한 이벤트 핸들러 구현
		btnCancel.setOnAction(event->btnCancelClick());
		
	} // initialize end

	public void btnCancelClick() { //취소버튼을 누르면 얘를 호출한다
		System.out.println("취소 버튼 클릭!");
	}
}
