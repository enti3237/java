package p469;

import java.util.Arrays;

import p470.Car;

public class Member implements Cloneable {

	public String name;
	public int age;
	public int[] arr;
	public Car car;

	public Member(String name, int age, int[] arr, Car car) {
		this.name = name;
		this.age = age;
		this.arr = arr;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age�� �����Ѵ�]
		Member cloned = (Member) super.clone();
		// arr�� ���� �����Ѵ�
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length);
		// car�� ���� �����Ѵ�
		cloned.car = new Car(this.car.model);
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
