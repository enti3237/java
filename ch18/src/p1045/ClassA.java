package p1045;

import java.io.Serializable;

import p1046.ClassB;

public class ClassA implements Serializable {
	
	public int field1;
	public ClassB field2 = new ClassB();
	public static int field3;
	public transient int filed4;

}
