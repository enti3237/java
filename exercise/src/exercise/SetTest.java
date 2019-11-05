package exercise;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {

		HashSet<Integer> a = new HashSet<Integer>();

		a.add(1);
		a.add(2);
		a.add(3);

		HashSet<Integer> b = new HashSet<Integer>();

		b.add(3);
		b.add(4);
		b.add(5);

		HashSet<Integer> c = new HashSet<Integer>();

		c.add(1);
		c.add(2);

		System.out.println(a.containsAll(b));
		System.out.println(a.containsAll(c));

//	a.addAll(b);
//	a.retainAll(b);
//	a.remove(b);

	}
}
