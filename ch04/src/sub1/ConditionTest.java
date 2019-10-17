package sub1;

/*
 * 날짜 : 2019-10-11
 * 이름 : 이지영
 * 내용 : 조건물 실습하기 교재 P.108
 */

public class ConditionTest {
	public static void main(String[] args) {
		
		//if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1이 num2보다 작다.");
		} // if(이 곳의 답이)틀릴 경우 식은 아래로 내려가지않는다
		
		// 중첩 if
		if(num1>0) {
			if(num2>1) {
				System.out.println("num1은 0보다 크고 sum2는 1보다 크다");
			}
		}
		
		if(num1 > 0 && num2 >1) {
			System.out.println("num1은 0보다 크고 sum2는 1보다 크다");
		}
		
		//if~else if~else
		int n1=1, n2=2, n3=3, n4=4;
		
		if(n1>n2) {
			System.out.println("n1이 n2보다 크다.");
			
		}else if(n2>n3) {
			System.out.println("n2가 n3보다 크다.");
			
		}else if(n3>n4) {
			System.out.println("n3이 n4보다 크다.");
			
		}else {
			System.out.println("n4가 제일 크다.");
		}
		
		//switch
		String fruit = "apple";
		
		switch(fruit) {
			case "banana":
				System.out.println("바나나입니다.");
				break;
			case "orange":
				System.out.println("오렌지입니다.");
				break;
			case "apple":
				System.out.println("사과입니다.");
				break;
			case "grape":
				System.out.println("포도입니다.");
				break;
			default:		
				System.out.println("알 수 없습니다.");
				break;
		}
		
		int xai = (int)(Math.random()*6)+1;
		
		switch(xai) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
			
		}
		
		int time = (int)(Math.random()*10)+7;
		System.out.println("[현재시간: " +time+ "시]");
		
		switch(time) {
		case 7:
			System.out.println("일어나라");
		case 8:
			System.out.println("일어나라고");
		case 9:
			System.out.println("일어나라니까");
		case 10:
			System.out.println("걍 자라");
		}
		System.out.println("프로그램 종료...");		
	}
}
