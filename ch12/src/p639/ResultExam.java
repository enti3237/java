package p639;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultExam {
	public static void main(String[] args) {

		ExecutorService exS = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("�۾� ó�� ��û");
		class Task implements Runnable {
			Result result;

			Task(Result result) {
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
		}

		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> fu1 = exS.submit(task1, result);
		Future<Result> fu2 = exS.submit(task2, result);

		try {
			result = fu1.get();
			result = fu2.get();
			System.out.println("ó�� ��� : " + result.accumValue);
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� ���� �߻��� - " + e.getMessage());
		}

		exS.shutdown();
	}
}

class Result {
	int accumValue;

	synchronized void addValue(int value) {
		accumValue += value;
	}
}
