package com.day18;

import java.net.InetAddress;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String host;
		
		System.out.print("호스트[www.naver.com]? ");
		host = sc.next(); //호스트 이름을 문자로 읽어옴.
		
		try {
			//ipv4 32bit ipv6 128bit /32bit 는 0~255.0~255.0~255.0~255 //아이피주소 8비트x4 =32비트.
									//128 비트는 8비트x16 =128비트 128비트를 연구하면서 하드웨어가 발전해 와이파이가 
									//하나의 아이피로 여러대를 사용할 수 있게 해줘서 128비트는 잘 사용하지않음.
			InetAddress ia = InetAddress.getByName(host); //도메인을 찾아서 DNS로 찾아가 그것에 대한 분해작업을 함.
			
			System.out.println("ip주소: " + ia.getHostAddress()); //분해작업을한 아이피와
			System.out.println("호스트: " + ia.getHostName()); //분해작업을 한 호스트네임을 출력.
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
