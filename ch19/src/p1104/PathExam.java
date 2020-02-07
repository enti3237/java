package p1104;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExam {
	
	public static void main(String[] args) {
		Path path = Paths.get("src/p1104/PathExam.java");
		System.out.println("[���ϸ�] " + path.getFileName());
		System.out.println("[�θ� ���丮 ��] " + path.getParent().getFileName());
		System.out.println("��ø ��μ� : " + path.getNameCount());
		
		System.out.println();
		for(int i=0 ; i<path.getNameCount() ; i++) {
			System.out.println(path.getName(i));
		}
		
		System.out.println();
		Iterator<Path> iterator = path.iterator();
		while(iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println(temp.getFileName());
		}
	}
}
