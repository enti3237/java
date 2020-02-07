package p1106;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExam {
	public static void main(String[] args) throws Exception {
		
		FileSystem filesystem = FileSystems.getDefault();
		for(FileStore store : filesystem.getFileStores()) {
			System.out.println("드라이버 명 : " + store.name());
			System.out.println("파일시스템 : " + store.type());
			System.out.println("전체 공간 : " + store.getTotalSpace() + " byte");
			System.out.println("사용 중인 공간 : " + (store.getTotalSpace() - store.getUsableSpace()) + " byte");
			System.out.println();
		}
		
		System.out.println("파일 구분자: " + filesystem.getSeparator());
		System.out.println();
		
		for(Path path : filesystem.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}
}
