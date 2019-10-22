package sub2;
/* 
 * 날짜 : 2019-10-22
 * 이름 : 이지영
 * 내용 : 인터페이스 실습하기 교재 p.344
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		
		//인터페이스 실습 2 - 다중 상속의 역할 (실제 설계에서는 지양할 부분)
		//다형성이랍시고 TV나 Computer를 앞에 붙일 수 없다 ㅇㅅㅇ) TV면 부팅과 인터넷이 안되고 컴이면 파워온오프가 안됨
		
		//TV를 부모로 하고 Computer를 인터페이스 삼은 (다중상속) SmartTV를 새로 객체화해서 띄운 것
		
		SmartTV stv = new SmartTV();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
		
	}

}
