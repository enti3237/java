package exam;

public class ShopServiceExam {
	public static void main(String[] args) {
		ShopService a1 = ShopService.getInstance();
		ShopService a2 = ShopService.getInstance();
		
		if(a1 == a2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
	}
}
