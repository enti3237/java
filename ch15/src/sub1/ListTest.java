package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥ : 2019-10-24
 * �̸� : ������
 * ���� : �÷��� �����ӿ�ũ ����Ʈ �ǽ��ϱ� ���� p.724
 */
public class ListTest {
	public static void main(String[] args) {
		
		//����Ʈ ���� �� ������ ����
		List<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1); // 1234

		list1.remove(2); //2�� �ε��� ��ȣ�� �� 3[2]�� ��������
		System.out.println(list1); // 124

		list1.add(0, 5); //(�ε�����ȣ, �ٲ� ��ü������) - 
		System.out.println(list1); //5124
		list1.add(3, 3); //4��°(0123) �ڸ��� 3�� �����
		System.out.println(list1); //51234
		System.out.println(list1.get(3)); //�ε��� 3���� ��ü������

		//����Ʈ ���� �� ������ ����
		List<String> list2 = new ArrayList<>();
		
		list2.add("������");
		list2.add("�̼���");
		list2.add("�����");
		System.out.println(list2);
		
		for(String name : list2) {
			System.out.println("list2 ���� : " +name);
		}
		//�� for�� ����... ã�ƺ��ô� �𸥴� ��_��; = ���� for��
		
		//��� ����Ʈ ���� �� ��� ����
		Apple a1 = new Apple("�ѱ�", 3000);
		Apple a2 = new Apple("�̱�", 2000);
		Apple a3 = new Apple("�Ϻ�", 1000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		System.out.println(list3);
		
		//��� ��ü ���� - ����Ʈ�� ũ�� = size 
		System.out.println("��� ��ü ���� : " +list3.size());

		//�������
		Apple apple = list3.get(1);
		apple.info();
		//���� ����
		list3.get(0).info();
		
	}
}
