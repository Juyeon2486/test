package com.day2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,num4;
		int max = 0, min = 0 ;
		
		
		System.out.println("첫번째 수");
		num1 = sc.nextInt();
		System.out.println("두번째 수");
		num2 = sc.nextInt();
		System.out.println("세번째 수");
		num3 = sc.nextInt();
		System.out.println("네번째 수");
		num4 = sc.nextInt();
		
		if(num1 >= num2 && num1 >= num3 && num1 >= num4) {
		 max = num1 ;
		}
		if(num2 >= num1 && num2 >= num3 && num2 >= num4) {
		 max = num2;	
		}
		if(num3 >= num1 && num3 >= num2 && num3 >= num4) {
		 max = num3;
		}
		if(num4 >= num1 && num4 >= num2 && num4 >= num3) {
	     max = num4 ;
		}
		if(num1 <= num2 && num1 <= num3 && num1 <= num4) {
		 min = num1 ;
		}
		if(num2 <= num1 && num2 <= num3 && num2 <= num4) {
		 min = num2 ;
		}
		if(num3 <= num1 && num3 <= num2 && num3 <= num4) {
		 min = num3 ;
		}
		if(num4 <= num1 && num4 <= num2 && num4 >= num3) {
		 min = num4;
		}
		System.out.println("제일 큰 수:" + max);
		System.out.println("제일 작은 수:" + min);
		
		
}
}