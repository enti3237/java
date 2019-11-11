package p635;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExam {
	public static void main(String[] args) {
		ExecutorService exS = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("�۾�ó����û");
		Runnable runn = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) { sum += i; }
				System.out.println("ó����� : " + sum);
			}
		};
		Future fu = exS.submit(runn);
		
		try {
			fu.get();
			System.out.println("�۾�ó���Ϸ�");
		} catch (Exception e) {
			System.out.println("���࿹�ܹ߻�" + e.getMessage());
		}
		
		exS.shutdown();
		
	}
}
