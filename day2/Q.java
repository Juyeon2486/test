package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int su;
		String str = "";
		
		System.out.println("���Է�?");
		su = Integer.parseInt(br.readLine());
		
		if(su%2==0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
				
		System.out.println(su + ":" + str);		
		
	}

}
