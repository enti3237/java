package sub2;

public class Library {
	
	//�������
	private String name;
	private String age;
	private String color;
		
	//������
	public Library (String name, String age, String color) {
		this.name = name;
		this.age  = age;
		this.color= color;
	}
	
	//����޼ҵ�
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
