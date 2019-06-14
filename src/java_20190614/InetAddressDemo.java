package java_20190614;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.println(iaddr.getHostName());
		System.out.println(iaddr.getHostAddress());
		
		InetAddress iaddr1 = InetAddress.getByName("naver.com");
		System.out.println(iaddr1.getHostName());
		System.out.println(iaddr1.getHostAddress());
	}
}
