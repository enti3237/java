package ex4;

import java.util.Arrays;

/**
 * 날짜 : OOOO/OO/OO
 * 이름 : 김철학
 * 내용 : 알고리즘 실습 - 로또번호 생성 
 * 
 * 개발과정
 * 1) 6번 반복을 시행해서 로또번호를 랜덤으로 하나씩 생성해서 배열에 저장
 * 2) 생성된 랜덤 숫자를 배열에 저장할때 이미 배열에 저장된 번호인지를 중복체크
 * 3) 중복체크시 배열의 모든 원소를 차례대로 비교
 * 4) 중복이 발견되면 해당 index번째 배열의 원소를 다시 랜덤 으로 구해서 중복체크  
 * 5) 배열에 저장된 번호를 오름차순으로 정렬 후 출력하기
 */
public class LottoTest {

	public static void main(String[] args) {

		int[] lotto = new int[6];

		for(int i=0 ; i<6 ; i++) {
			
			// 1 ~ 45번 중 랜덤으로 하나 생성
			int num = (int)Math.ceil(Math.random()*45);

//			lotto[i] = (int)(Math.random()*44)+1;
//			System.out.print(lotto[i]+" ");
			
			// lotto 배열에 저장 - 이 배열에 저장한다는 감각이 잘 안 나오네 ㅇㅆㅇ;
			lotto[i] = num;
			
			// 중복체크
			for(int j=0 ; j<i ; j++) {
				if(lotto[j] == lotto[i]) {
					i--;					//인덱스를 하나 낮춰서 24줄의 for문을 한번 더 실행함
					break;
				}
			}
		}

		// 배열원소를 오름차순으로 정렬
		Arrays.sort(lotto);

		// 배열 원소 출력
		for(int num : lotto) {
			System.out.print(num+ " ");
		}
	}
}