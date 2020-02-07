package p1052;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import p1051.Child;

public class NonSerializableParentExam {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/Temp/obj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Child child = new Child();
		child.field1 = "ȫ�浿";
		child.field2 = "ȫ���";
		oos.writeObject(child);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:/Temp/obj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child)ois.readObject();
		System.out.println("field1 : "+ v.field1);
		System.out.println("field2 : "+ v.field2);
		ois.close();
		fis.close();
	}

}
