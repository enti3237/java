package sub4;

import java.io.FileReader;
import java.util.Properties;

/*
 * ��¥ : 2019-11-05
 * �̸� : ������
 * ���� : ������Ƽ �÷��� �ǽ��ϱ� ���� 748p
 */
public class PropertiesTest {

	public static void main(String[] args) throws Exception {

		// Properties�� �⺻ ������ �����
		Properties pro1 = new Properties();
		pro1.setProperty("101", "����");
		pro1.setProperty("102", "����");
		pro1.setProperty("103", "�뱸");
		pro1.setProperty("104", "�λ�");
		pro1.setProperty("105", "����");

		System.out.println("101�� ������ : " + pro1.getProperty("101"));
		System.out.println("104�� ������ : " + pro1.getProperty("104"));

		// ��Ʈ���� ���� ������ �Է�
		String s1 = "C:\\Users\\java\\Desktop\\data.properties";

		FileReader fr = new FileReader(s1);

		Properties pro2 = new Properties();
		pro2.load(fr);

		System.out.println("101�� ������ : " + pro2.getProperty("102"));
		System.out.println("105�� ������ : " + pro2.getProperty("105"));

	}

}
