package exam;

public class ShopServiceExam {
	public static void main(String[] args) {
		ShopService a1 = ShopService.getInstance();
		ShopService a2 = ShopService.getInstance();
		
		if(a1 == a2) {
			System.out.println("���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
	}
}
