package ex5;

//��Ŭ���� ȣ���� ��� ��-��)
import java.util.Scanner;

public class GCDTest2 {

	public static void main(String[] args) {

		int v1, v2;
		int r = 1;
		int rs;

		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		v1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		v2 = sc.nextInt();

		int t1 = v1, t2 = v2;	// �Է¹��� ���� ���� �����Ѵ�
		if (v1 < v2) {			// ó�� ���� ���ڰ� �ι�° ���� ���ں��� ������ ������ �ٲ��ֱ�
			v1 = t2;
			v2 = t1;
		}

		while (r > 0) {			// r�� 0 ���ϰ� �Ǹ� ������ ����
			r = v1 % v2;		// r�� ū �� ������ ���� ���� ������
			v1 = v2;			// ���� ����  ū �� ��ġ��
			v2 = r;				// �������� ���� �� ��ġ��
		}

		rs = t1 * t2 / v1;		// rs�� (ū �� ���ϱ� ���� ��) ������ (r�� 0 ���ϰ� ���� ���� ū ��)

		System.out.println("�ִ����� : " + v1); // ū ��(>���� ��) ������ ���� ��(>������)�� �ݺ��Ͽ� �������� 0�� ���� ���� ū �� ��  
		System.out.println("�ּҰ���� : " + rs); // ���� �Է� �� ���� ���ؼ� �ִ�����(v1)�� ���� ��

	}
}