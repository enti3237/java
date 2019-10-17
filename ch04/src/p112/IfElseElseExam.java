package p112;

public class IfElseElseExam {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("A 등급입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89점입니다.");
			System.out.println("B 등급입니다.");
		} else if(score>70) {
			System.out.println("점수가 70~79점입니다.");
			System.out.println("c 등급입니다.");
		} else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("D 등급입니다.");
		}

	}

}
