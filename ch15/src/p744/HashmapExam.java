package p744;

import java.util.HashMap;
import java.util.Map;
import p743.Student;

public class HashmapExam {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		// 새로 생성했어도 같은 값으로 저장

		System.out.println(map.size());
		
	}
}
