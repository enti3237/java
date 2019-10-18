package sub1;

/*
 * 날짜 : 2019-10-15
 * 이름 : 이지영
 * 내용 : 배열 실습하기
 */

public class ArrayTest {
	public static void main1(String[] args) {
		
		// 배열 (0부터 시작한다)
		int num[] = {1, 2, 3, 4, 5};

		System.out.println("num 배열의 1번째 원소 : " +num[0]);
		System.out.println("num 배열의 2번째 원소 : " +num[1]);
		System.out.println("num 배열의 3번째 원소 : " +num[2]);
		System.out.println("num 배열의 4번째 원소 : " +num[3]);
		System.out.println("num 배열의 5번째 원소 : " +num[4]);
		
		for(int i = 0 ; i <5 ; i++) {
			System.out.println("num 배열의 "+(i+1)+"번째 원소 : " +num [i]);
		}
		
		// 연습
		String person[] = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		for(int p=0 ; p<5 ; p++) {
			System.out.println((p+1)+"번째 사람 이름: "+person[p]);
		}
		
	}

}
