package sub2;
/*
 * ��¥ : 2019-10-16
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */
public class ClassTest {
	public static void main(String[] args) {

		// ������ ��ü kb ���ο��� Account�� ��� 7��(Ư��4�� �޼ҵ�3��)�� �ְ� ĸ��ȭ �Ŀ� ���⼭ ������ �ʱ�ȭ�ؾ���.
		Account kb = new Account("��������", "121-11-1234", "������", 10000);

		/*
		// ������� �ʱ�ȭ... �� �ѵ� ������ ���⼭ ������ �� ������ �ȵ�. ������ �����ϱ�.
		kb.bank = "��������";
		kb.id   = "121-11-1234";
		kb.name = "������";
		kb.money= 10000;
		*/
		
		// ���Ȱ��
		kb.deposit(20000);
		kb.withdraw(5000);
		// kb.money -= 1; // ����ڵ�. Ư��(�������)�� ���� ����(����)�� �� �־ �ȵȴ�. -> ĸ��ȭ(private)�� ��
		kb.info();
		
		//��ǻ�� ��ü����
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac    = new Computer("INTEL i5", "4GB", "512GB");
		
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		imac.calc();
		imac.internet();
		imac.info();
		
		Library bmd = new Library("keil", "20", "red");
		
		bmd.list1();
		bmd.info();
		bmd.list2();
						
	}

}
