package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2019-10-24
 * 이름 : 이지영
 * 내용 : 컬렉션 프레임워크 리스트 실습하기 교재 p.733
 */
public class SetTest {
	public static void main(String[] args) {
		
		//집합 생성 및 데이터 저장 - Hashset 말고 Set 쓰는 게 좋음
		Set<Double> set = new HashSet<Double>();
		
		set.add(1.0);
		set.add(2.0);
		set.add(3.0);
		set.add(4.0);
		set.add(2.0); //데이터 중복 불가
		
		System.out.println(set);
		System.out.println(set.size());

		//집합원소 꺼내기 - 지정해서 꺼낼 수 없음
		//집합원소를 (랜덤으로) 추출해주는 반복자
		//걍 it 만 쓰면 무한추출
		Iterator<Double> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
