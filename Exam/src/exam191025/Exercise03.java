package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 03
 */

public class Exercise03 {
	public static void main(String[] args) {

		//for문을 사용하여 1~100까지의 정수 중 3의 배수의 총합을 구하시오 (5)
		int sum = 0;

		for(int i=0 ; i<=100 ; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합 : " +sum);
		
	}
}