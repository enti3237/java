package exam191025;
/*
 * ��¥ : 2019-10-25
 * �̸� : ������
 * ���� : �����򰡼� �򰡹��� 05-LogInOutó��
 */

public class MemberService {
	public boolean login(String id, String password) {
		
		//�α��� �޼���� id�� "hong" password�� "12345"�� �� trur return �� �ܿ� false 
		if(id.equals("hong") && password.equals("12345")) {
//			if(id=="hong" && password=="12345") { �������� �� �ٿ��ֱ� ���з� ���� �����̾��µ� �̰� Ȯ���� Ʋ�ȴپƤ���������������������
			return true;
		} else {
			return false;
		}
	}
	
	//�α׾ƿ� �޼���� "�α׾ƿ� �Ǿ����ϴ�"�� ��µ� ��
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}