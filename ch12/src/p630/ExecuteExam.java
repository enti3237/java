package p630;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExam {
	public static void main(String[] args) throws Exception {

		ExecutorService exS = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {

			Runnable runn = new Runnable() {

				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor tPE = (ThreadPoolExecutor) exS;
					int size = tPE.getPoolSize();
					String thN = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수 : " + size + " ] 작업스레드 이름 : " + thN);
					// 예외 발생 시킴
					int value = Integer.parseInt("삼");
				}
			};
			
			exS.execute(runn);
			Thread.sleep(10);
		}
		
		exS.shutdown();
		System.out.println("끝");
	}
}
