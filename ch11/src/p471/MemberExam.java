package p471;

import p469.Member;
import p470.Car;

public class MemberExam {
	public static void main(String[] args) {

		Member original = new Member("Miki", 25, new int[] { 90, 90 }, new Car("Sonata"));

		Member cloned = original.getMember();
		cloned.arr[0] = 100;
		cloned.car.model = "Bentz";

		System.out.println("���� ��ü�� �ʵ尪");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("arr : {");
		for (int i = 0; i < cloned.arr.length; i++) {
			System.out.print(cloned.arr[i]);
			System.out.print((i == (cloned.arr.length - 1)) ? "" : ",");
			// ���� ? (A) : (B) - ������ ������ A�� Ʋ���� B�� ����Ѵ�
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);

		System.out.println();

		System.out.println("���� ��ü�� �ʵ尪");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("arr : {");
		for (int i = 0; i < original.arr.length; i++) {
			System.out.print(original.arr[i]);
			System.out.print((i == (original.arr.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);
		
		System.out.println();
		System.out.println(original.name.equals(cloned.name));

	}

}
