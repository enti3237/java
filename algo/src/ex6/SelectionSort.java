package ex6;

/*
 * 날짜 : 2019-11-01
 * 이름 : 이지영
 * 내용 : 알고리즘 실습 - 선택정렬 
 * 
 * 개발과정
 * 참조) https://www.youtube.com/watch?v=xWBP4lzkoyM
 * 1) 배열의 1번째 원소를 2, 3, 4, 5번째 원소와 차례로 비교  
 * 2) 1번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 * 3) 배열의 2번째 원소를 3, 4, 5번째 원소와 차례로 비교
 * 4) 2번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 * 5) 배열의 3번째 원소를 4, 5번째 원소와 차례로 비교  
 * 6) 3번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 * 7) 이와 같이 최종 원소가 하나 남을 때까지 반복 수행
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 5, 3 };
		int min;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}

		// 정렬된 배열 출력하기
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
