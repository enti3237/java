package sub1;
/*
 * 날짜 : 2019-10-15
 * 이름 : 이지영
 * 내용 : 메서드 실행영역과 메모리 생성
 */
public class MethodScoptest {
	public static void main(String[] args) {
		
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		System.out.println(start+"부터 " +end+ "까지의 합 :" +result);
		
	}
	
	public static int sum(int s, int e) {
		int sum = 0;
		for(int k=s ; k<=e ; k++) {
			sum += k;
		}
		
		return sum;
	}

}
