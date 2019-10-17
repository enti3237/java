package sub2;
/*
 * 날짜 : 2019-10-16
 * 이름 : 이지영
 * 내용 : 자바 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {

		// 생성된 객체 kb 내부에는 Account의 멤버 7개(특성4개 메소드3개)가 있고 캡슐화 후엔 여기서 변수를 초기화해야함.
		Account kb = new Account("국민은행", "121-11-1234", "김유신", 10000);

		/*
		// 멤버변수 초기화... 긴 한데 변수를 여기서 지정할 수 있으면 안됨. 위에서 실행하기.
		kb.bank = "국민은행";
		kb.id   = "121-11-1234";
		kb.name = "김유신";
		kb.money= 10000;
		*/
		
		// 기능활용
		kb.deposit(20000);
		kb.withdraw(5000);
		// kb.money -= 1; // 취약코드. 특성(멤버변수)을 직접 지정(참조)할 수 있어선 안된다. -> 캡슐화(private)할 것
		kb.info();
		
		//컴퓨터 객체생성
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
