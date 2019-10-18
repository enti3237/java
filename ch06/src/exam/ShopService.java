package exam;

public class ShopService {
	//싱글톤 만들기
	//정적필드 (static singleton)
	private static ShopService singleton = new ShopService();
	
	//생성자
	private ShopService() {}
		
	//정적메소드 (앞에는 퍼블릭이 있어야함)
	public static ShopService getInstance() {
		return singleton;
	}
}
