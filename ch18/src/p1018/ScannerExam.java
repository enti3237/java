package p1018;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String inputString = scan.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("���� �Է�: ");
		int inputInt = scan.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("�Ǽ� �Է�: ");
		double inputDouble = scan.nextDouble();
		System.out.println(inputDouble);
		System.out.println();
	}
}
