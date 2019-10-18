package sub1;

/*
 * 날짜 : 2019-10-15
 * 이름 : 이지영
 * 내용 : 다차원 배열 실습하기
 */

public class ArrayTest2 {
	public static void main(String[] args) {
		//1차원 배열 (int[] s / int []s / int [] s 등 위치는 상관없다)
		int[] score = {80, 60, 78, 69, 87,92};
		int sum = 0;
		
		for(int i=0 ; i<6 ; i++) {
			sum += score[i];
		}
		
		System.out.println("점수의 총합 : " +sum);
		System.out.println("점수의 평균 : " +sum/score.length); //배열의 길이
		
		//배열의 반복문
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) { // jumsu라는 배열의 길이만큼 반복한다
			total += n; //jumsu[n]쓰면 에러남
		}
		System.out.println("jumsu의 합: " +total);
		
		//2차원 배열 (가로세로축이 0부터 시작함. ex. 5는 1.2)
		int arr[][] = {	{ 1,  2,  3}, 
						{ 4,  5,  6}, 
						{ 7,  8,  9}, 
						{10, 11, 12}};
		
		for(int a=0 ; a<4 ; a++) {
			for(int b=0 ; b<3 ; b++) {
				System.out.println("arr["+a+"]["+b+"]=" + arr[a][b]);
			}
		}
		
		
	}
}
