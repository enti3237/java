package p587;

public class ThreadNameExam {

	// 순서가 기묘하게 꼬이네
	public static void main(String[] args) throws Exception {

		Thread main = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + main.getName());

		ThreadA a = new ThreadA();
		System.out.println("작업스레드 이름" + a.getName());
		a.start();

		ThreadB b = new ThreadB();
		System.out.println("작업스레드 이름" + b.getName());
		b.start();

	}
}
//프로그램 시작 스레드 > 스레드 ab는 무작위로 시작되므로 run의 내용물은 그대로 나오지만 ab의 프린트출력은 멋대로임 