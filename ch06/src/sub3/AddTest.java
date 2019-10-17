package sub3;
/*
 * 날짜 : 2019-10-16
 * 이름 : 이지영
 * 내용 : 클래스 메모리 생성 실습하기
 */
public class AddTest {
	
	public static void main(String[] args) {
		
		Adder ad1 = new Adder();
		ad1.x = 100;
		int[] arr = {10,20,30};
		
		ad1.add(100);
		System.out.println("ad1.x = " +ad1.x);
		// x = 100+50 = 150
		
		ad1.add(ad1);
		System.out.println("ad1.x = " +ad1.x);
		// x = ad1 + 40 = 150 + 40 = 190
		
		ad1.add(arr);
		System.out.println("arr[0] = " +arr[0]);
		// 0행의 값에서 1을 더한다

		ad1 = ad1.addNew(ad1);
		System.out.println("ad1.x =" +ad1.x);
		// new로 새로운 객체를 참조했기 때문에 상기의 ad1.x은 성립하지 않고 초기값 0이 들어온다.
		
	}

}
