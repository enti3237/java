package sub1;
/* 
 * 날짜 : 2019-10-22
 * 이름 : 이지영
 * 내용 : 인터페이스 실습하기 교재 p.344
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
//		인터페이스 실습 1 - 클래스 설계의 표준 가이드 역할
//		RemoteLG lg = new RemoteLG();
//		RemoteSamsung samsung = new RemoteSamsung();
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.soundDown();

		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
	}
}
