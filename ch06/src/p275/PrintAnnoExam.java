package p275;

import java.lang.reflect.Method;

import p274.PrintAnno;

public class PrintAnnoExam {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declareMethods = Service.class.getDeclaredMethods();
		
		//Method 객체를 하나씩 처리
		for(Method method : declareMethods) {
			//PrintAnno가 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnno.class)) {
				//PrintAnno 객체 얻기
				PrintAnno printanno = method.getAnnotation(PrintAnno.class);
				
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				//구분선 출력
				for(int i=0 ; i<printanno.number(); i++) {
					System.out.println(printanno.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}

}
