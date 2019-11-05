package sub1;
//마이셀프 - 두자리숫자표기 개선이 필요함

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController2 implements Initializable {

	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btnPl;
	@FXML private Button btnMi;
	@FXML private Button btnMt;
	@FXML private Button btnDv;
	@FXML private Button btnEq;
	@FXML private Button btnCc;
	@FXML private TextField txtDp;
	
	
	int temp1 = 0;
	int temp2 = 0;
	int operator = 0;
	boolean isFirst = true;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btn0.setOnAction(event->btn0Click());
		btn1.setOnAction(event->btn1Click());
		btn2.setOnAction(event->btn2Click());
		btn3.setOnAction(event->btn3Click());
		btn4.setOnAction(event->btn4Click());
		btn5.setOnAction(event->btn5Click());
		btn6.setOnAction(event->btn6Click());
		btn7.setOnAction(event->btn7Click());
		btn8.setOnAction(event->btn8Click());
		btn9.setOnAction(event->btn9Click());
		btnPl.setOnAction(event->btnPlClick());
		btnMi.setOnAction(event->btnMiClick());
		btnMt.setOnAction(event->btnMtClick());
		btnDv.setOnAction(event->btnDvClick());
		btnEq.setOnAction(event->btnEqClick());
		btnCc.setOnAction(event->btnCcClick());
		
	} // initialized end
	
	public void setOperation(int type) {
		
	}
	
	public void setNum(int num) {
		
	}
	
	public void btn0Click() {setNum(0);}
	public void btn1Click() {
		temp1 = 1;
		txtDp.setText("1");
	}
	public void btn2Click() {
		temp1 = 2;
		txtDp.setText("2");
	}
	public void btn3Click() {
		temp1 = 3;
		txtDp.setText("3");
	}
	public void btn4Click() {
		temp1 = 4;
		txtDp.setText("4");
	}
	public void btn5Click() {
		temp1 = 5;
		txtDp.setText("5");
	}
	public void btn6Click() {
		temp1 = 6;
		txtDp.setText("6");
	}
	public void btn7Click() {
		temp1 = 7;
		txtDp.setText("7");
	}
	public void btn8Click() {
		temp1 = 8;
		txtDp.setText("8");
	}
	public void btn9Click() {
		temp1 = 9;
		txtDp.setText("9");
	}
	public void btnPlClick() {
		operator = 1;
		temp2 = temp1;
	}
	public void btnMiClick() {
		operator = 2;
		temp2 = temp1;
	}
	public void btnMtClick() {
		operator = 3;
		temp2 = temp1;
	}
	public void btnDvClick() {
		operator = 4;
		temp2 = temp1;
	}
	public void btnEqClick() {
		int rs = 0;
		if(operator == 1) {
			rs = temp1 + temp2;
		} else if(operator == 2) {
			rs = temp1 - temp2;
		} else if(operator == 3) {
			rs = temp1 * temp2;
		} else if(operator == 4) {
			rs = temp1 / temp2;
		}
		
		txtDp.setText("" + rs);
	}
	
	public void btnCcClick() {
		temp1 = 0;
		temp2 = 0;
		operator = 0;
		
		txtDp.setText("0");
	}
	
}
