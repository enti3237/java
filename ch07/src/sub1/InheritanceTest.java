package sub1;
/*
 * 날짜 : 2019-10-17
 * 이름 : 이지영
 * 내용 : 
 */

public class InheritanceTest {
	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount("키움증권","345-14-44", "김춘추", 100000, "삼성전자", 10, 30000);
		kw.deposit(30000);
		kw.buy(15);
		kw.sell(5);
		kw.info();
		System.out.println();
		
		Smartphone iphone = new Smartphone("A10", "4GB", "128GB", "iphone10", "010-1111-2222", 1000000);
		Smartphone galaxy = new Smartphone("2.3GHz", "4GB", "516GB", "galaxy10", "010-1111-3333", 1100000);

		iphone.info();
		iphone.call();
		iphone.internet();
		System.out.println();
		
		galaxy.info();
		galaxy.call();
		galaxy.internet();
	}
}
