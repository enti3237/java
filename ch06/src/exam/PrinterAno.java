package exam;

public class PrinterAno {
	
	//필드 따로 설정하지 않고 외부에서 객체를 생성하지 않아도 읽을 수 있음
	//정적멤버 static = 클래스멤버
	
	static int println(int x1) {
		System.out.println(x1);
		return x1;
	}
	static boolean println(boolean x2) {
		System.out.println(x2);
		return x2;
	}
	static double println(double x3) {
		System.out.println(x3);
		return x3;
	}
	static String println(String x4) {
		System.out.println(x4);
		return x4;
	}

}
