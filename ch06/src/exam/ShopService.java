package exam;

public class ShopService {
	//�̱��� �����
	//�����ʵ� (static singleton)
	private static ShopService singleton = new ShopService();
	
	//������
	private ShopService() {}
		
	//�����޼ҵ� (�տ��� �ۺ��� �־����)
	public static ShopService getInstance() {
		return singleton;
	}
}
