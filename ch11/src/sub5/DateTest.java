package sub5;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * ��¥ : 2019-10-23
 * �̸� : ������
 * ���� : �ڹ�  Date Ŭ���� �ǽ��ϱ� ���� p.539
 */

public class DateTest {
	public static void main(String[] args) {
		
		//��� �ű԰�ü ���� ����
		Date d = new Date();
		
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("����ð��� yyyy/MM/dd hh:mm:ss �Դϴ�");
		String dd = sdf.format(d);
		System.out.println(dd);
		
	}
}
