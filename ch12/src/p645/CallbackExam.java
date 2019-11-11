package p645;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExam {

	private ExecutorService exS;

	public CallbackExam() {
		exS = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() ½ÇÇà : " + result);
		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() ½ÇÇà : " + exc.toString());
		}
	};

	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int rs = intX + intY;
					callback.completed(rs, null);
				} catch (Exception e) {
					callback.failed(e, null);
				}
			}
		};
		exS.submit(task);
	}

	public void finish() {
		exS.shutdown();
	}

	public static void main(String[] args) {
		CallbackExam exam = new CallbackExam();
		exam.doWork("3", "3");
		exam.doWork("3", "»ï");
		exam.finish();
	}
}
