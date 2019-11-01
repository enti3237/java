package p590;

public class PriorityExam {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread a = new CalcThread("thread" + i);
			if (i != 10) {
				a.setPriority(Thread.MIN_PRIORITY);
			} else {
				a.setPriority(Thread.MAX_PRIORITY);
			}
			a.start();
		}
	}
}
// 10개의 a라는 스레드 객체를 생성하고 이름을 1234로 붙인다
// thread10에 최우선순위를 준다.
// a 객체는 Calc에서 run 명령을 오버라이딩해서 1부터 20억까지 루핑을 실행한다
// 제일 빠른 게 10 나머지는 랜덤
