package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

/*
 * ��¥ : 2019-11-05
 * �̸� : ������
 * ���� : ���ϸ�����Ʈ�� �ǽ��ϱ� ���� 1032p
 */
public class FileReaderTest {

	public static void main(String[] args) throws Exception {

		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";

		// �Է½�Ʈ�� ���� �� ���� ����
		FileReader fis = new FileReader(file1);

		// �ݺ����� ���� ������ �о���̱�
		while (true) { // while���� true�� ���� if�� �ݵ�� break�� ����

			int data = fis.read(); // �����ʹ� �������� 0�� 1�� �̷���� ����������
			if (data == -1) {break;}

			// �ܼ����
			char ch = (char) data;
			System.out.print(ch);

//			// ��½�Ʈ������ ������ ����
//			fos.write(data);
		}

		// �Է½�Ʈ�� ����
		fis.close();

		System.out.println("��Ʈ�� �۾� ����");

	}
}