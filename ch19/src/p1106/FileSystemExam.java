package p1106;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExam {
	public static void main(String[] args) throws Exception {
		
		FileSystem filesystem = FileSystems.getDefault();
		for(FileStore store : filesystem.getFileStores()) {
			System.out.println("����̹� �� : " + store.name());
			System.out.println("���Ͻý��� : " + store.type());
			System.out.println("��ü ���� : " + store.getTotalSpace() + " byte");
			System.out.println("��� ���� ���� : " + (store.getTotalSpace() - store.getUsableSpace()) + " byte");
			System.out.println();
		}
		
		System.out.println("���� ������: " + filesystem.getSeparator());
		System.out.println();
		
		for(Path path : filesystem.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}
}
