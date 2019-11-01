package p581;

import java.awt.Toolkit;

//비프음을 발생시키면서 동시에 프린팅하기
//메인스레드가 혼자 처리할 경우 비프음 발생을 전부 한 후 프린트를 실행해야한다
public class BeepPrintExam {
	public static void main(String[] args) throws InterruptedException {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("비프");
			Thread.sleep(500);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("땅");
			Thread.sleep(500);
		}

	}

}
