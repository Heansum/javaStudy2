package chapter9;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		// 도메인: ip주소로 서버에 접근해야하는데
		// ip주소는 0~255사이의 4자리 숫자로 이루어져 있으므로
		// 접근성이 떨어짐
		// 숫자를 의미있는 문자로 지정해서 사용하는게 더 편함
		// [도메인 네임 서비스] -> DNS
		
		InetAddress ip = null;
		InetAddress ipArray[] = null;
		
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() = " + ip.getHostName());
			System.out.println("getHostAddress() = " + ip.getHostAddress());
			System.out.println("toString() = " + ip.toString());
			
			// IP -> 4자리 숫자로 이루어져있음 / 1Byte
			byte[] ipAddress = ip.getAddress();
			System.out.println("getAddress() = " + Arrays.toString(ipAddress));
			
			String result = "";
			for(int i=0; i<ipAddress.length; i++) {
				result += (ipAddress[i] < 0) ? ipAddress[i] + 256 : ipAddress[i];
				result += ".";
			}
			
			System.out.println("getAddress() + 256" + result);
			System.out.println("===== =====");
			
			ip = InetAddress.getLocalHost();
			
			System.out.println("getHostName() = " + ip.getHostName());
			System.out.println("getHostAddress() = " + ip.getHostAddress());
			System.out.println("===== =====");
			
			ipArray = InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<ipArray.length; i++) {
				System.out.println("ipArray["+i+"] = " + ipArray[i]);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
