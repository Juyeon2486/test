package com.day18;

import java.net.InetAddress;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String host;
		
		System.out.print("ȣ��Ʈ[www.naver.com]? ");
		host = sc.next(); //ȣ��Ʈ �̸��� ���ڷ� �о��.
		
		try {
			//ipv4 32bit ipv6 128bit /32bit �� 0~255.0~255.0~255.0~255 //�������ּ� 8��Ʈx4 =32��Ʈ.
									//128 ��Ʈ�� 8��Ʈx16 =128��Ʈ 128��Ʈ�� �����ϸ鼭 �ϵ��� ������ �������̰� 
									//�ϳ��� �����Ƿ� �����븦 ����� �� �ְ� ���༭ 128��Ʈ�� �� �����������.
			InetAddress ia = InetAddress.getByName(host); //�������� ã�Ƽ� DNS�� ã�ư� �װͿ� ���� �����۾��� ��.
			
			System.out.println("ip�ּ�: " + ia.getHostAddress()); //�����۾����� �����ǿ�
			System.out.println("ȣ��Ʈ: " + ia.getHostName()); //�����۾��� �� ȣ��Ʈ������ ���.
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
