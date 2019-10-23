package p529;

public class Boxing {
	public static void main(String[] args) {
		
		//Boxing
		Integer o1 = new Integer(100);
		Integer o2 = new Integer("200");
		Integer o3 = Integer.valueOf("300");
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);

		//unBoxing
		int v1 = o1.intValue();
		int v2 = o2.intValue();
		int v3 = o3.intValue();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
	}

}
