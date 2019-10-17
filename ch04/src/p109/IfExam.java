package p109;

public class IfExam {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("A 등급입니다.");
		}
		
		if(score<90) 
			System.out.println("점수가 90점보다 작습니다.");	// 중괄호가 없으면 한줄만 if의 영향이 미침
			System.out.println("B 등급입니다.");			// 그러므로 이건 걍 출력된다.
		
	}

}
