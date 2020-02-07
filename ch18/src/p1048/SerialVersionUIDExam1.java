package p1048;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExam1 {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/temp/obj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		fos.close();
		
	}

}
