package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 07
 */

public class Exercise07 {
	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}

	}
}