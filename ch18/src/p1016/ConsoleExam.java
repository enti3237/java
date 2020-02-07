package p1016;

import java.io.Console;

public class ConsoleExam {
	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("ID: ");
		String id = console.readLine();
		
		System.out.println("PASSWORD: ");
		char[] charPass = console.readPassword();
		String strPass = new String(charPass);
		
		System.out.println("-------------------");
		System.out.println(id);
		System.out.println(strPass);
	}
}
