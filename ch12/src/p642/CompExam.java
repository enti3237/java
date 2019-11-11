package p642;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompExam {
	public static void main(String[] args) {

		ExecutorService exS = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		CompletionService<Integer> comS = new ExecutorCompletionService<Integer>(exS);

		System.out.println("작업 처리 요청");
		for (int i = 0; i < 3; i++) {
			comS.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}

		System.out.println("처리 완료된 작업 확인");
		exS.submit(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Future<Integer> fu = comS.take();
						int value = fu.get();
						System.out.println("처리 결과 : " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			exS.shutdown();
		}
	}
}
