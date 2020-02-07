package p1056;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("郴 哪腔磐 IP 林家 : " + local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress remote : iaArr) {
			System.out.println("www.naver.com IP林家 : " + remote.getHostAddress());
		}
		
	}

}
