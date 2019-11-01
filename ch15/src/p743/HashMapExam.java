package p743;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {

		// MAP 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// 90과 키가 같기 때문에 더 아래의 값인 95로 덮어씌워짐
		System.out.println("총 엔트리 수 : " + map.size());
		
		// 객체찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keyset = map.keySet();
		System.out.println(keyset);

		Iterator<String> keyite = keyset.iterator();
		
		while(keyite.hasNext()) {
			String key = keyite.next();				// 다음 키를 계속 얻는다
			Integer value = map.get(key);			// 키의 값을 얻는다
			System.out.println();
			System.out.println(key);
			System.out.println(value);
		}
		
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 엔트리 수 : " + map.size());
		System.out.println(keyset);
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryite = entryset.iterator(); //while문 용
		System.out.println(entryset);

		while(entryite.hasNext()) {
			Map.Entry<String, Integer> entry = entryite.next();
			String key = entry.getKey();
			Integer value = map.get(key);
			System.out.println();
			System.out.println(key);
			System.out.println(value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		
		map.clear();
		System.out.println(map.size());

	}
}
