package p311;

import p310.Child;
import p310.Parents;

public class ChildExam {
	
	public static void main(String[] args) {
		
		Child child = new Child();		

		// �ڵ�Ÿ�Ժ�ȯ
		Parents parents = child;
		
		parents.method1();
		parents.method2();
		//parents.method3();
		
	}

}
