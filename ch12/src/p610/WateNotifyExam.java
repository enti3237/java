package p610;

import p609.ThreadA;
import p609.ThreadB;
import p609.WorkObj;

public class WateNotifyExam {
	public static void main(String[] args) {
		
		WorkObj so = new WorkObj();
		
		ThreadA ta = new ThreadA(so);
		ThreadB tb = new ThreadB(so);
		
		ta.start();
		tb.start();
		
		//A�� ���� �� ���� �ְ� B�� ���� �� ���� ������ �� �������ʹ� ���������� ��
	}
}