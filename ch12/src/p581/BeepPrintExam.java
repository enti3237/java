package p581;

import java.awt.Toolkit;

//�������� �߻���Ű�鼭 ���ÿ� �������ϱ�
//���ν����尡 ȥ�� ó���� ��� ������ �߻��� ���� �� �� ����Ʈ�� �����ؾ��Ѵ�
public class BeepPrintExam {
	public static void main(String[] args) throws InterruptedException {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("����");
			Thread.sleep(500);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			Thread.sleep(500);
		}

	}

}
