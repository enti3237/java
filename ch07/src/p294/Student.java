package p294;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//부모생성자 호출
		super(name, ssn);
		this.studentNo = studentNo;
	}
	

}
