package p743;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//이름을 키로 점수를 값으로 저장하기

public class HashMapExam {
	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("이순신", 185);
		map.put("김유신", 190);
		map.put("김춘추", 190);
		map.put("장보고", 191);
		map.put("장보고", 185);
		map.put("홍길동", 150);
		
		//저장된 총 객체 수 (키값이 중복되면 빠진다 - 순서대로 들어가게 되니까 위쪽 값이 빠짐)
		System.out.println("총 엔트리 수 : " +map.size());
		
		//객체 찾기
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		//keySet 얻기
		Set<String> keyset = map.keySet();
		//반복해서 키를 얻고 값을 Map에서 얻어냄
		Iterator<String> keyIte = keyset.iterator();
		while(keyIte.hasNext()) {
			String key = keyIte.next();
			Integer val = map.get(key);
			System.out.println("\t" + key + " : " +val);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 엔트리 수 : " +map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryite = entryset.iterator();
		
		while(entryite.hasNext()) {
			Map.Entry<String, Integer> entry = entryite.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("\t" + key + " : " +val);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 엔트리 수 : " +map.size());

	}
}
