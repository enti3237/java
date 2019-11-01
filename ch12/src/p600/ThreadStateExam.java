package p600;

import p598.StatePrintThread;
import p599.TargetThread;

public class ThreadStateExam {
	public static void main(String[] args) {
		
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
		
	}

}
