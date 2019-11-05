package p613;

import p611.DataBox;
import p612.ProducerThread;

public class WaitNExam {
	public static void main(String[] args) {
		
		DataBox db = new DataBox();
		
		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);
		
		pt.start();
		ct.start();
		
	}
}