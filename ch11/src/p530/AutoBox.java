package p530;

public class AutoBox {
	public static void main(String[] args) {
		
		//자동박싱
		Integer o1 = 100;
		System.out.println("value: " +o1.intValue());
		
		//대입시 자동 언박싱
		int value = o1;
		System.out.println("value: " +value);
		
		//연산시 자동 언박싱 - Integer로 박싱한 변수(객체가 된)를 인트 산술식에 넣어도 자동으로 변환됨
		int rs = o1 + 100;
		System.out.println("rs: " +rs);
		
		
	}

}
