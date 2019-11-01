package ex7;

/*
 * 날짜 : 2019-11-01
 * 이름 : 이지영
 * 내용 : 알고리즘 실습 - 삽입정렬 
 * 
 * 개발과정
 * 참고) https://www.youtube.com/watch?v=OGzPmgsI-pQ
 * 1) 배열의 2번째 원소를 1번째 원소와 비교하여 작으면 1번째 원소와 자리 교환
 * 2) 배열의 3번째 원소를 2번째 원소와 비교하여 작으면 2번째 원소와 자리 교환 그리고 다시 1번째 원소와 비교하여 작으면 1번째 원소와 자리 교환 
 * 3) 위와 같은 과정을 반복 수행
 */
public class InsertSort {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 5, 3 };

		for (int j = 1; j < arr.length; j++) {

			int key = arr[j];
			int i = j - 1;

			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}

//			arr[i] = key; 아니 왜 이게 / 상단에 i -= 1이 있어서 +1 해준 거
			arr[i + 1] = key;

		}

		// 정렬된 배열 출력하기
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
