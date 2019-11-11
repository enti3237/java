package p524;

import java.util.Arrays;

public class SortExam {
	public static void main(String[] args) {

		int[] arr = { 99, 97, 98 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		String[] names = { "Miki", "Len", "Aika" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();

		Member m1 = new Member("Miki");
		Member m2 = new Member("Len");
		Member m3 = new Member("Aika");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].name);
		}
	}
}
