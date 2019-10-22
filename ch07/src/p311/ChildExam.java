package p311;

import p310.Child;
import p310.Parents;

public class ChildExam {
	
	public static void main(String[] args) {
		
		Child child = new Child();		

		// 자동타입변환
		Parents parents = child;
		
		parents.method1();
		parents.method2();
		//parents.method3();
		
	}

}
