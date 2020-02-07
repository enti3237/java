package p1063;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {
	public static void main(String[] args) throws Exception {
		
		Socket socket = null;
		
		socket = new Socket();
		System.out.println("연결요청");
		socket.connect(new InetSocketAddress("localhost", 5001));
		System.out.println("연결성공");
		
		byte[] bytes = null;
		String message = null;
		
		OutputStream os = socket.getOutputStream();
		message = " Hello Server ";
		bytes = message.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		System.out.println("데이터 보내기 성공");
		
		InputStream is = socket.getInputStream();
		bytes = new byte[100];
		int readByteCount = is.read(bytes);
		message = new String(bytes, 0, readByteCount, "UTF-8");
		System.out.println("데이터 받기 성공: " + message);
		
		os.close();
		is.close();
		
		if(!socket.isClosed()) {
			socket.close();
		}
	}
}
