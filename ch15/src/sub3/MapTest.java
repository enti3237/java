package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Banana;

/*
 * 날짜 : 2019-10-24
 * 이름 : 이지영
 * 내용 : 컬렉션 프레임워크 맵 실습하기 교재 p.740
 */
public class MapTest {
	public static void main(String[] args) {
		
		//맵 생성 및 데이터 저장
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "한국");
		map1.put(102, "미국");
		map1.put(103, "일본");
		map1.put(104, "중국");
		
		System.out.println(map1);
		System.out.println("map1의 원소갯수 : " +map1.size());
		
		//맵 원소 꺼내기
		String v1 = map1.get(101);
		System.out.println(v1);
		//심플하게
		System.out.println(map1.get(104));
		
		//바나나 맵 생성 및 바나나 저장
		Map<String, Banana> map2 = new HashMap<>();
		map2.put("kor",new Banana("한국", 3000));
		map2.put("usa",new Banana("미국", 2500));
		map2.put("jap",new Banana("일본", 2000));
		
		//미국 바나나 꺼내기 (객체 지정할 때 이름 쓰는 거 매번 헷갈리네 - String이 아니라 Banana)
		Banana b1 = map2.get("usa");
		b1.info();

		
	}
	

}
