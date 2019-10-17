package sub2;

public class Library {
	
	//멤버변수
	private String name;
	private String age;
	private String color;
		
	//생성자
	public Library (String name, String age, String color) {
		this.name = name;
		this.age  = age;
		this.color= color;
	}
	
	//멤버메소드
	public void list1() {
		System.out.println("===============");
	}
	public void list2() {
		System.out.println("===============");
	}
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
	}

}
