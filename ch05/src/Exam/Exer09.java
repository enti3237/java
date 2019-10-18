package Exam;
import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("======================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("======================================");
			System.out.print("선택> ");
		
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			System.out.print("학생수> ");
			studentNum = scanner.nextInt();
		} else if(selectNo == 2) {
			System.out.println("score[0]> ");
			score[0] = scanner.nextInt();
			System.out.println("score[1]> ");
			score[1] = scanner.nextInt();
			System.out.println("score[2]> ");
			score[2] = scanner.nextInt();
		} else if(selectNo == 3) {
			System.out.println("score[0]> : "+score[0]);
			System.out.println("score[1]> : "+score[1]);
			System.out.println("score[2]> : "+score[2]);
		} else if(selectNo == 4) {
			System.out.println("최고점수 : "+studentNum);
			System.out.println("평균점수 : ");
		} else if(selectNo == 5) {
			run = false;
		}
		}	
		System.out.println("프로그램 종료");
	}
	
}
