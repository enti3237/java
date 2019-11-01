package p743;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {

		// MAP �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ��ü����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);	// 90�� Ű�� ���� ������ �� �Ʒ��� ���� 95�� �������
		System.out.println("�� ��Ʈ�� �� : " + map.size());
		
		// ��üã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keyset = map.keySet();
		System.out.println(keyset);

		Iterator<String> keyite = keyset.iterator();
		
		while(keyite.hasNext()) {
			String key = keyite.next();				// ���� Ű�� ��� ��´�
			Integer value = map.get(key);			// Ű�� ���� ��´�
			System.out.println();
			System.out.println(key);
			System.out.println(value);
		}
		
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� ��Ʈ�� �� : " + map.size());
		System.out.println(keyset);
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryite = entryset.iterator(); //while�� ��
		System.out.println(entryset);

		while(entryite.hasNext()) {
			Map.Entry<String, Integer> entry = entryite.next();
			String key = entry.getKey();
			Integer value = map.get(key);
			System.out.println();
			System.out.println(key);
			System.out.println(value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		
		map.clear();
		System.out.println(map.size());

	}
}
