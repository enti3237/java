package sub1;
/*
 * 날짜 : 2019-10-11
 * 이름 : 이지영
 * 내용 : 조건문 연습문제
 */

public class IfTest {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101)+0;

		if(score>=90 && score<=100) {
			System.out.println("점수" +score+ "는 A입니다.");	
		}else if(score>=80 && score<90){
			System.out.println("점수" +score+ "는 B입니다.");
		}else if(score>=70 && score<60) {
			System.out.println("점수" +score+ "는 C입니다.");
		}else if(score>=60 && score<50) {
			System.out.println("점수" +score+ "는 D입니다.");
		}else if(score>=0 && score<60) {
			System.out.println("점수" +score+ "는 E입니다.");
		}else
			System.out.println("점수" +score+ "는 에러입니다.");
		
		
	}

}
