package p1048;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExam2 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("c:/Temp/obj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC)ois.readObject();
		System.out.println("field1 : "+ classC.field1);
	}
}
