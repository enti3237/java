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
		// 먼저 얕은 복사를 해서 name, age를 복제한다]
		Member cloned = (Member) super.clone();
		// arr을 깊은 복사한다
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length);
		// car를 깊은 복수한다
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
