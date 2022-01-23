package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//제어문,반복문
		//if, for, while, do~while, switch
		//제어문 if, swich
		//반복문 for , while, do~while
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int su;
		String str = ""; //(초기화를 위해서 ""를 써줌
	
		
		System.out.print("수입력?");
		su = Integer.parseInt(br.readLine());
		//단일 if문
	/*	//if(조건)	
		if(su%2==0) {
			str = "짝수";
		}
		 //su%2==1과 같다. 	
		if(su%2!=0) {
			str = "홀수";
		}  //작업이 하나 일때는 { } 대괄호를 생략하여 써도된다.
		*/
		
		if(su%2==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		
		
		System.out.println(su + ":" + str);
		
}
	
}
		
		
