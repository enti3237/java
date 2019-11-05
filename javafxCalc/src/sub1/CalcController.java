package sub1;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable {

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
	
	int temp1 = 0;
	int temp2 = 0;
	int operator = 0;
	boolean isFirst = true;
	
	public void setOperation(int type) {

		
	
	}
	
	public void setNum(int num) {
		if(isFirst) {
			txtDp.setText(""+num);
			isFirst = false;
		} else {
			String getNum = txtDp.getText();
			String totNum = getNum + num;
			int cNum = Integer.parseInt(totNum); 
			txtDp.setText("" +cNum);
			}
	}
	
	public void btn0Click() {setNum(0);}
	public void btn1Click() {setNum(1);}
	public void btn2Click() {setNum(2);}
	public void btn3Click() {setNum(3);}
	public void btn4Click() {setNum(4);}
	public void btn5Click() {setNum(5);}
	public void btn6Click() {setNum(6);}
	public void btn7Click() {setNum(7);}
	public void btn8Click() {setNum(8);}
	public void btn9Click() {setNum(9);}
	public void btnPlClick() {setOperation(1);}
	public void btnMiClick() {setOperation(2);}
	public void btnMtClick() {setOperation(3);}
	public void btnDvClick() {setOperation(4);}
	public void btnEqClick() {
		
		String getNum = txtDp.getText();
		temp2 = Integer.parseInt(getNum);
				
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
