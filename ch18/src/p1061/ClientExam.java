package p1061;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {
	public static void main(String[] args) throws Exception {
		
		Socket socket = null;
		
		socket = new Socket();
		System.out.println("�����û");
		socket.connect(new InetSocketAddress("localhost", 5001));
		System.out.println("���Ἲ��");
		
		if(!socket.isClosed()) {
			socket.close();
		}
	}
}
