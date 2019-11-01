package p591;

public class MainThreadExam {
	public static void main(String[] args) {

		Calc calc = new Calc();

		// User1 스레드 설정 - 공유객체 설정 - 스레드 시작
		User1 user1 = new User1();
		user1.setCalc(calc);
		user1.start();

		// User2 스레드 설정 - 공유객체 설정 - 스레드 시작
		User2 user2 = new User2();
		user2.setCalc(calc);
		user2.start();

		// 결과는 50/50으로 뜬다 User2의 Calc가 User1의 것을 먹어서...
		// 수정을 위해 Calc에 동기화를 시킴
	}
}