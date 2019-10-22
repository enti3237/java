package sub3;
/* 
 * 날짜 : 2019-10-22
 * 이름 : 이지영
 * 내용 : 인터페이스 실습하기 교재 p.344
 */
public class InterfaceTest3 {

	public static void main(String[] args) {
		
		//인터페이스 실습 3 - 객체간의 결합도를 완화
		
		Bulb bulb = new Bulb();
		//Cable cable = new Cable(bulb);
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();

	}

}
