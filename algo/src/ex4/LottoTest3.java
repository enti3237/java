package ex4;

import java.util.Arrays;

public class LottoTest3 {
	public static void main(String[] args) {
		//필드 설정
		int[] lotto = new int[6];
		//6자리에 45까지의 랜덤숫자 추출
		for(int i=0 ; i<lotto.length ; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			//각 자리에 중복된 숫자를 빼고 인덱스 숫자를 하나 줄여서 다시 계산함. 범위는 인덱스 범위까지만.
			for(int j=0 ; j<i ; j++) {
				if(num == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(num + " ");
			//이건 아래줄에 못 뜸 num은 for문 안에서 주어진 함수
			//for문 밖에 두면 되지 않나? > 아 이러면 그냥 랜덤 숫자가 무한대로 생성되겠그나 ㅇ_)
		}
		System.out.println();
		System.out.println("오늘의 로또번호 : " + Arrays.toString(lotto));
		//Array 랑  Arrays는 다릅니다 toString이 안 붙으면 내가 뭘 썼나 의심해봅시다...
	}
}