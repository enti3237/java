package sub2;

/*
 * 날짜 : 2019-10-14
 * 이름 : 이지영
 * 내용 : for 문 실습하기 
 */

public class ForTest {
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		
		//for (int에 별다른거 지정 안해도 되는구나...)
		for(int i=1 ; i<=3 ; i++) {
			System.out.println("Hello Java!");
		}
		
		//1부터 10까지의 합 (이건 식이 a+b 상태라 ab를 다 지정해줘야함)
		int sum = 0;
		for(int k = 1 ; k <= 10 ; k++) {
			sum += k;
		}

		System.out.println("1부터 10까지의 합 : " +sum);
		System.out.println();
		
		//1부터 10까지 짝수합
		int total = 0;

		/*	for(int k = 0 ; k <= 10 ; k+=2) {
			total += k; (이래도 되긴 하지만) */ 

		for(int k = 0 ; k <= 10 ; k+=2) {
			if(k%2==0) {
				total += k;
			}
		
		}
		System.out.println("1부터 10까지 짝수의 합 : " + total);
		System.out.println();
		
		//중첩 for 문
		
		for(int a=1 ; a<=3 ; a++) {
			System.out.println("a : "+a);
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : "+b);
			}
		}
		System.out.println();

		//구구단 출력
		
		for(int a=2 ; a<=9 ; a++) {
			System.out.println();
			System.out.println(a+"단");
			
			for(int b=1 ; b<=9 ; b++) {
				int c = a*b;
			
				System.out.println(a+ "x" +b+ "=" +c); //2*1부터 9까지 반복출력한 후 3으로 돌아가서 다시 반복
			}
		}
		
		//별삼각형 출력
		for(int start=1 ; start<=10 ; start++) {
			
			for(int end=1; end<=start ; end++) {
				System.out.print("☆"); //println 아니라서 줄바꿈 안되고 한줄에 연속출력됨
			}
			
			System.out.print("\n");
		}

		//별역삼각형 출력
		for(int start=10 ; start>=1 ; start--) {
			
			for(int end=1; end<=start ; end++) {
				System.out.print("★");
			}
			
			System.out.print("\n");
		}

		//별역삼각형 출력
		for(int a=1 ; a<=5 ; a++) {
			System.out.print("\n");
			
			for(int b=1 ; b<=5-a ; b++) {
				System.out.print("☆");
			}
			
			for(int c=1 ; c<=a ; c++) {
				System.out.print("★");
			}
		}
		
		
		
		
		
		
		
	}
}