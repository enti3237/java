package p729;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("»´±Êµø", "±Ë¿ØΩ≈", "±Ë√·√ﬂ");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 5);
		for(int value : list2) {
			System.out.print(value + " ");
		}
	}

}
