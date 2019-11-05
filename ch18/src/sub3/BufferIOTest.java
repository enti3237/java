package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOTest {

	public static void main(String[] args) throws Exception {

		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";

		// ����½�Ʈ�� ���� �� ���� ����
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		// ���۽�Ʈ�� ���� �� ���� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// �ݺ����� ���� ������ �о���̱�
		while (true) { // while���� true�� ���� if�� �ݵ�� break�� ����

			int data = bis.read(); // �����ʹ� �������� 0�� 1�� �̷���� ����������

			if (data == -1) {
				break;
			}
			
			// ��½�Ʈ������ ������ ����
			bos.write(data);

		}

		// �Է½�Ʈ�� ����
		fis.close();
		fos.close();
		
		System.out.println("��Ʈ�� �۾� ����");

	}
}
