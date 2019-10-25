package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 07-싱글톤
 */

public class ShopService {

	//ShopService 객체를 하나로 한정시킨다
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return instance;
	}

}