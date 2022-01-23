package com.day2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//세개의 수를 입력받아서 작은 수 에서 큰 수 순으로 출력(오름차순)
		//세개의 수? 9 5 2
		//결과: 2 5 9
		//비교는 if문으로 if n1>n2{자리바꿈
		//자리바꿈 temp = num1; num1 = num2; num2=temp;
		
		Scanner sc = new Scanner(System.in);
		
		int temp,num1,num2,num3;
		
		System.out.print("세개의 수?");//9 5 2
	
		num1 = sc.nextInt();//9
		num2 = sc.nextInt();//5
		num3 = sc.nextInt();//2
	
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
        System.out.printf("결과: %d %d %d\n",num1,num2,num3);
	    
	    
		
		
		
		
		
		
		
		
	}

}
