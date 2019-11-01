package p743;

// equals �� hashCode ������

public class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public boolean equals(Object ob) {
		if(ob instanceof Student) {
			Student st = (Student) ob;
			return (sno == st.sno) && (name.equals(st.name));
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}
