package p621;

import java.util.Map;
import java.util.Set;

import p619.AutoSaveThread;

public class ThreadInfoExam {
	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();
		auto.setName("AutoSaveThread");
		auto.setDaemon(true);
		auto.start();

		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> arr = map.keySet();
		for (Thread th : arr) {
			System.out.println("Name: " + th.getName() + ((th.isDaemon()) ? "(����)" : "(��)"));
			System.out.println("\t" + "�Ҽӱ׷� : " + th.getThreadGroup().getName());
			System.out.println();
		}
	}
}
