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
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("======================================");
			System.out.print("����> ");
		
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			System.out.print("�л���> ");
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
			System.out.println("�ְ����� : "+studentNum);
			System.out.println("������� : ");
		} else if(selectNo == 5) {
			run = false;
		}
		}	
		System.out.println("���α׷� ����");
	}
	
}
