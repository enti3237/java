package p625;

import p624.WorkThread;

public class ThreadGroupExam {
	public static void main(String[] args) throws Exception {

		ThreadGroup myGp = new ThreadGroup("myGroup");
		WorkThread woA = new WorkThread(myGp, "WOA");
		WorkThread woB = new WorkThread(myGp, "WOB");

		woA.start();
		woB.start();

		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGp = Thread.currentThread().getThreadGroup();
		mainGp.list();
		System.out.println();

		Thread.sleep(3000);

		System.out.println("[ myGp 스레드 그룹의 interrupt() 메소드 호출]");
		myGp.interrupt();
	}
}
