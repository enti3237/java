package sub2;

/*
 * 날짜 : 2019-10-14
 * 이름 : 이지영
 * 내용 : while 반복문 실습하기
 */

public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합
		// for와는 달리 조건문이 밖에 나와있음
		
		int k = 1;
		int sum = 0;
		
		while(k<=1000) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지의 합 : " +sum);
		
		
		// do ~while (한번은 무조건 실행되게 하는데 의미가 있다)
		
		int total = 0;
		int i = 1;
		
		do {
			if (i%2 == 1) {

				total += i; // 이거 중괄호 안 써도 되긴 하더라 ㅇㅅㅇ;
			}
			
			i++;
			
		}while(i<=10);
		
		System.out.println("1부터 10까지 홀수의 합 : " +total);

	
		// break
		
		int num = 0;
		
		while(true) { 						//while(true) = 무한반복 용 공식. break와 쓰인다
			num++;

			if (num%5 == 0 && num%7 ==0) { 	//1씩 계속 증가하는 num이 5와 7로 나누었을 때 나머지가 0이 된다면
				break; 						//반복문 탈출 
			}
		}
		
		System.out.println("5와 7의 최소공배수 : " + num); //앗 이제 슬슬 프로그래밍의 의의가 느껴짐
		
		
		// continue
		int tot = 0;
		
		for(int a=1 ; a<=10 ; a++) {
			if(a%2 == 0) {
				continue; 					// 반복문의 상위로 되돌려보낸다
			}
			
			tot += a;
		}
		
		System.out.println("1부터 10까지의 홀수합 : "+tot);
		
	}
	
}
