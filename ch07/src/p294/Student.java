package p294;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//�θ������ ȣ��
		super(name, ssn);
		this.studentNo = studentNo;
	}
	

}
