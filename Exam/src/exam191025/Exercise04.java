package exam191025;
/*
 * 날짜 : 2019-10-25
 * 이름 : 이지영
 * 내용 : 수행평가서 평가문항 04
 */

public class Exercise04 {
	public static void main(String[] args) {
		
		//주어진 배열의 원소 가운데 최댓값을 구하시오 (5)
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0 ; i<array.length ; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("배열의 최대값 : " +max);

	}
}