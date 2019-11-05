package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��¥ : 2019-11-05
 * �̸� : ������
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p1018
 */
public class FileIOTest {

	public static void main(String[] args) throws Exception {

		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";

		// �Է½�Ʈ�� ���� �� ���� ����
		FileInputStream fis = new FileInputStream(file1);

		// ��½�Ʈ�� ���� �� ���� ����
		FileOutputStream fos = new FileOutputStream(file2);
		
		
		
		// �ݺ����� ���� ������ �о���̱�
		while (true) { // while���� true�� ���� if�� �ݵ�� break�� ����

			int data = fis.read(); // �����ʹ� �������� 0�� 1�� �̷���� ����������

			if (data == -1) {
				break;
			}

			// �ܼ����			
//			char ch = (char)data;
//			System.out.print(ch);
			
			// ��½�Ʈ������ ������ ����
			fos.write(data);

		}

		// �Է½�Ʈ�� ����
		fis.close();
		fos.close();
		
		System.out.println("��Ʈ�� �۾� ����");

	}
}
