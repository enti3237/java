package p613;

import p611.DataBox;

public class ConsumerThread extends Thread {

	private DataBox db = new DataBox();

	public ConsumerThread(DataBox db) {
		this.db = db;
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				String data = db.getData();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
