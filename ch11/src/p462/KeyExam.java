package p462;

import java.util.HashMap;

import p461.Key;

public class KeyExam {
	public static void main(String[] args) {

		HashMap<Key, String> hashMap = new HashMap<>();

		hashMap.put(new Key(1), "Miki");

		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}