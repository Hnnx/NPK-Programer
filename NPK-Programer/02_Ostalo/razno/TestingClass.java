package razno;

import java.net.InetAddress;

//Class za hitro testiranje code snippetov
public class TestingClass {
	
	public static void main(String[] args) {
		
		String website = "www.facebook.com";
		String hostName = "";
		String ipAddress = "";
		
		try {
			InetAddress ipNaslov = InetAddress.getByName(website);			
			
			hostName = ipNaslov.getHostName();
			ipAddress = ipNaslov.getHostAddress();
					
			
		} catch (Exception e) {
			System.out.println("Cannot connect to website: " + website);
		}
		
		System.out.println("Spletna stran " + hostName);
		System.out.println("IP Naslov: "+ ipAddress);
		
		
		
	}

}
