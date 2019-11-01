package sub1;
/*
 * 날짜 : 2019-10-28
 * 이름 : 이지영
 * 내용 : 람다식 실습하기 교재 p678
 */

public class LambdaTest {
	public static void main(String[] args) {

		// 람다식 : 매개변수를 가진 코드블럭
		Type1 t1 = () -> {
			System.out.println("Type1 람다식 실행");
		};
		Type2 t2 = (x) -> {
			System.out.println("Type2 람다식 실행 : " + x);
		};
		Type3 t3 = (x, y) -> {
			int rs = x + y;
			return rs;
		};

		// 람다식 실행
		t1.fx();
		t2.fx(1);
		int rs = t3.fx(2, 3); // 리턴문이니까 받아와야함
		System.out.println("Type3 람다식 실행 : " + rs);
	}

}
