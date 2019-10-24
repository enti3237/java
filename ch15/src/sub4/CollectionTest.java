package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2019-10-24
 * 이름 : 이지영
 * 내용 : 컬렉션 프레임워크 응용실습하기
 */
public class CollectionTest {
	public static void main(String[] args) {
		
		//리스트-맵 구조 생성 및 데이터 저장
		//인덱스를 사과로 삼은 맵이 리스트화 되어있다		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<Integer, Apple>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2500));
		m1.put(103, new Apple("일본", 2000));
		
		Map<Integer, Apple> m2 = new HashMap<Integer, Apple>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2500));
		m2.put(203, new Apple("호주", 2000));
		
		Map<Integer, Apple> m3 = new HashMap<Integer, Apple>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2500));
		m3.put(303, new Apple("베트남", 2000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);

// 		이하는 맵 단일출력이 됨 ㅇ_ㅇ
//		//한국사과 info 출력
//		Apple a1 = m1.get(101);
//		a1.info();
//		
//		//호주사과 출력
//		Apple a2 = m2.get(203);
//		a2.info();
//		
//		//태국사과 출력
//		Apple a3 = m3.get(302);
//		a3.info();

		//리스트 넘버로 일단 빼고 - 다음 인덱스 넘버를 빼는 방법을 써서 한국 호주 태국사과 출력 ㅇ_ㅇ)
		Map<Integer, Apple> mp1 = list.get(0);
		Apple apple = mp1.get(101);
		apple.info();
		
		list.get(1).get(203).info();
		
		list.get(2).get(302).info();
		
	}
}
