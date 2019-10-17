package sub2;
/*
 * 날짜 : 2019-10-17
 * 이름 : 이지영
 * 내용 : 클래스 상속 실습하기
 */
public class Inherit {
	public static void main(String[] args) {
		Person p1 = new Person("김유신", 25);
		Student s1 = new Student("김춘추", 21, "부산대학교", "컴공과");
		SalaryStudent ss1 = new SalaryStudent("이순신", 22, "부산외대", "자바어", "삼진");

		p1.hello();
		System.out.println("=============");
		s1.hello();
		System.out.println("=============");
		ss1.hello();
	}

}
