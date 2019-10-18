package p275;

import p274.PrintAnno;

public class Service {
	@PrintAnno
	public void method1() {
		System.out.println("실행내용 1");
	}
	
	@PrintAnno("*")
	public void method2() {
		System.out.println("실행내용 2");
	}
	
	@PrintAnno(value="#", number=20)
	public void method3() {
		System.out.println("실행내용 3");
	}

}
