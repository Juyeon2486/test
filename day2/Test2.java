package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//System.in 은 1byet InputStreamReader로 2byte로 만들어준다.
		//InputStreamReader는 브릿지 역할
		int num1,num2;
		
		System.out.println("첫번째 수?");//20
		num1 = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 수?");//5
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d + %d = %d\t",num1,num2,(num1+num2));
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf("%d * %d = %d\t",num1,num2,(num1*num2));
		System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));	
		System.out.printf("%d %% %d = %d\n",num1,num2,(num1%num2));
		
		
		System.out.println("num1>num2: " + (num1>num2));
		System.out.println("num1==num2: " + (num1==num2));
		//숫자를 등호나 부등호( ==,>,<,>=,<= )로 구분하면 true,false가 나옴 
		
		
		String str;
		
		//삼항연산자(조건? true값:false값)
		str = num1%2==0?"짝수":"홀수";
              //(조건)	
		str = num1>0?"양수":(num1<0?"음수":"영");
		
		//A and(&&) B : A도 true이고 B도 true
		//A or(||) B : A만 true,B만  true, 둘다 true
		str = num1%4==0 && num1%100!=0 || num1%400==0?"윤년":"평년";
		//윤년을 구하는 공식★ 윤년은 4년마다 돌아옴
		System.out.println(num1 + ":" + str);
		
	
	
	}

}
