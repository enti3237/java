package exam191025;
/*
 * ��¥ : 2019-10-25
 * �̸� : ������
 * ���� : �����򰡼� �򰡹��� 05
 */

public class Exercise05 {
	public static void main(String[] args) {
		
		//�α��εǾ����ϴ� \% �α׾ƿ��Ǿ����ϴٰ� ��µǵ��� (10)
		MemberService memberService = new MemberService();
		//���̵� hong, �н����忡 12345�� �Էµ�
		boolean result = memberService.login("hong", "12345");
	
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}
}