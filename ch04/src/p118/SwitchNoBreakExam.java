package p118;

public class SwitchNoBreakExam {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재시간은 " + time + "시입니다.");
		
		switch(time) {
		case 8 :
			System.out.println("8시에 출근합니다.");
		case 9 :
			System.out.println("9시에 회의를 합니다.");
		case 10 :
			System.out.println("10시에 업무를 봅니다.");
		case 11 :
			System.out.println("11시에 외근을 나갑니다.");
		}
		
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		case 'C':
		case 'c':
			System.out.println("손님입니다.");
			break;
		}
	}

}
