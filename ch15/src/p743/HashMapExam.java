package p743;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//�̸��� Ű�� ������ ������ �����ϱ�

public class HashMapExam {
	public static void main(String[] args) {
		
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�̼���", 185);
		map.put("������", 190);
		map.put("������", 190);
		map.put("�庸��", 191);
		map.put("�庸��", 185);
		map.put("ȫ�浿", 150);
		
		//����� �� ��ü �� (Ű���� �ߺ��Ǹ� ������ - ������� ���� �Ǵϱ� ���� ���� ����)
		System.out.println("�� ��Ʈ�� �� : " +map.size());
		
		//��ü ã��
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		//keySet ���
		Set<String> keyset = map.keySet();
		//�ݺ��ؼ� Ű�� ��� ���� Map���� ��
		Iterator<String> keyIte = keyset.iterator();
		while(keyIte.hasNext()) {
			String key = keyIte.next();
			Integer val = map.get(key);
			System.out.println("\t" + key + " : " +val);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� ��Ʈ�� �� : " +map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryite = entryset.iterator();
		
		while(entryite.hasNext()) {
			Map.Entry<String, Integer> entry = entryite.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("\t" + key + " : " +val);
		}
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� ��Ʈ�� �� : " +map.size());

	}
}
