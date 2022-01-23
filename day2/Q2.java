package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
          
		Scanner sc = new Scanner(System.in);
		
	int num1,num2;
	
	//입력
	System.out.println("첫번째 수?");
	num1 = sc.nextInt();
	System.out.println("두번째 수?");
	num2 = sc.nextInt();
	
	System.out.printf("큰수는: %d ",(num1>num2)?num1:num2);
	System.out.printf("작은수는: %d ",(num1<num2)?num1:num2);
	
	
	}
}
