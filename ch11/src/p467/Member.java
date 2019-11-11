package p467;

public class Member implements Cloneable {
	
	public String id;
	public String name;
	public String pass;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String pass, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() throws Exception {
		Member cloned = null;
		
		cloned = (Member) clone();
		return cloned;
	}

}
