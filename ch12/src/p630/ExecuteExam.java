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
					// ������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor tPE = (ThreadPoolExecutor) exS;
					int size = tPE.getPoolSize();
					String thN = Thread.currentThread().getName();
					System.out.println("[�� ������ ���� : " + size + " ] �۾������� �̸� : " + thN);
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};
			
			exS.execute(runn);
			Thread.sleep(10);
		}
		
		exS.shutdown();
		System.out.println("��");
	}
}
