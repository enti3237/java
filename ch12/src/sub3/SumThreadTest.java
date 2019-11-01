package sub3;
/*
 * 날짜 : 2019-10-28
 * 이름 : 이지영
 * 내용 : 쓰레드Thread 실습하기 교재 p576
 */

//단일쓰레드 run
//st1이 서브쓰레드의 생성자를 불러오고 인트 자리에 시작과 끝을 지정해주기
//애드를 상속한 서브쓰레드에서 오버라이드 된 run 명령어가 setNum 명령대로 시작부터 끝까지 순차합을 실행함

//복합쓰레드 start
//를 쓰기 위해선 Imp...만으로는 모자라서 상단에 Thread 객체를 새로 구현해준 후 start명령에 그 객체를 지정한다
//join 선언 필요. 동기화블럭은 필요없다 왜지

public class SumThreadTest {
	public static void main(String[] args) throws Exception {

		SubThread st1 = new SubThread(1, 50);
		SubThread st2 = new SubThread(51, 100);

		// 러너블만으로는 모자라서 쓰레드를 구현해줘야함
		Thread t1 = new Thread(st1);
		Thread t2 = new Thread(st2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		int rs1 = st1.getNum();
		int rs2 = st2.getNum();
		int tot = rs1 + rs2;

		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println("결과 : " + tot);

	}
}