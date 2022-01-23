package com.day14;

import java.io.IOException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		char str;
		
		do {			
			System.out.print("성별?[w,m]");//w(enter:13,10) 아스키값 13,10
			str = (char)System.in.read();
			System.in.skip(2);
			
		}while(str!='m'&&str!='w');
		
		System.out.println(str + "---");
		
		
		

	}

}
