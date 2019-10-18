package p275;

import java.lang.reflect.Method;

import p274.PrintAnno;

public class PrintAnnoExam {
	public static void main(String[] args) {
		//Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declareMethods = Service.class.getDeclaredMethods();
		
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declareMethods) {
			//PrintAnno�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnno.class)) {
				//PrintAnno ��ü ���
				PrintAnno printanno = method.getAnnotation(PrintAnno.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("["+method.getName()+"]");
				//���м� ���
				for(int i=0 ; i<printanno.number(); i++) {
					System.out.println(printanno.value());
				}
				System.out.println();
				
				try {
					//�޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}

}
