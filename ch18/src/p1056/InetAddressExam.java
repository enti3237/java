package p1056;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("�� ��ǻ�� IP �ּ� : " + local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress remote : iaArr) {
			System.out.println("www.naver.com IP�ּ� : " + remote.getHostAddress());
		}
		
	}

}
