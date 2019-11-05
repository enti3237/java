package p612;

import p611.DataBox;

public class ProducerThread extends Thread {

	private DataBox db = new DataBox();

	public ProducerThread(DataBox db) {
		this.db = db;
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			try {
				db.setData(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
