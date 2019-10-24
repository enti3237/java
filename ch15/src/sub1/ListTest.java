package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2019-10-24
 * 이름 : 이지영
 * 내용 : 컬렉션 프레임워크 리스트 실습하기 교재 p.724
 */
public class ListTest {
	public static void main(String[] args) {
		
		//리스트 생성 및 데이터 저장
		List<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1); // 1234

		list1.remove(2); //2는 인덱스 번호임 즉 3[2]이 지워진다
		System.out.println(list1); // 124

		list1.add(0, 5); //(인덱스번호, 바뀔 객체데이터) - 
		System.out.println(list1); //5124
		list1.add(3, 3); //4번째(0123) 자리에 3이 끼어듬
		System.out.println(list1); //51234
		System.out.println(list1.get(3)); //인덱스 3번의 객체데이터

		//리스트 생성 및 데이터 저장
		List<String> list2 = new ArrayList<>();
		
		list2.add("김유신");
		list2.add("이순신");
		list2.add("정약용");
		System.out.println(list2);
		
		for(String name : list2) {
			System.out.println("list2 원소 : " +name);
		}
		//이 for문 뭔데... 찾아봅시다 모른다 ㅇ_ㅇ; = 향상된 for문
		
		//사과 리스트 생성 및 사과 저장
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		Apple a3 = new Apple("일본", 1000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		System.out.println(list3);
		
		//사과 전체 갯수 - 리스트의 크기 = size 
		System.out.println("사과 전체 갯수 : " +list3.size());

		//정보출력
		Apple apple = list3.get(1);
		apple.info();
		//위와 같음
		list3.get(0).info();
		
	}
}
