package exam191025;
/*
 * ��¥ : 2019-10-25
 * �̸� : ������
 * ���� : �����򰡼� �򰡹��� 07-�̱���
 */

public class ShopService {

	//ShopService ��ü�� �ϳ��� ������Ų��
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return instance;
	}

}