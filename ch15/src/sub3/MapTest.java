package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Banana;

/*
 * ��¥ : 2019-10-24
 * �̸� : ������
 * ���� : �÷��� �����ӿ�ũ �� �ǽ��ϱ� ���� p.740
 */
public class MapTest {
	public static void main(String[] args) {
		
		//�� ���� �� ������ ����
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "�ѱ�");
		map1.put(102, "�̱�");
		map1.put(103, "�Ϻ�");
		map1.put(104, "�߱�");
		
		System.out.println(map1);
		System.out.println("map1�� ���Ұ��� : " +map1.size());
		
		//�� ���� ������
		String v1 = map1.get(101);
		System.out.println(v1);
		//�����ϰ�
		System.out.println(map1.get(104));
		
		//�ٳ��� �� ���� �� �ٳ��� ����
		Map<String, Banana> map2 = new HashMap<>();
		map2.put("kor",new Banana("�ѱ�", 3000));
		map2.put("usa",new Banana("�̱�", 2500));
		map2.put("jap",new Banana("�Ϻ�", 2000));
		
		//�̱� �ٳ��� ������ (��ü ������ �� �̸� ���� �� �Ź� �򰥸��� - String�� �ƴ϶� Banana)
		Banana b1 = map2.get("usa");
		b1.info();

		
	}
	

}
