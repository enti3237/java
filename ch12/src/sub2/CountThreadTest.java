package sub2;
/*
 * 날짜 : 2019-10-28
 * 이름 : 이지영
 * 내용 : 
 */

public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {

		Count count = new Count();

		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);

		ct1.start();
		ct2.start();
		ct3.start();

		// 서브스레드가 메인스레드로 다시 합류되기까지 메인스레드 대기

		ct1.join();
		ct2.join();
		ct3.join();

		System.out.println("결과: " + count.getNum());

	}

}
//
