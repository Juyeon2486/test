package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int num1,num2;
		char oper;

		System.out.print("첫번째 수?");
		num1 = sc.nextInt();

		System.out.print("두번째 수?");
		num2 = sc.nextInt();

		System.out.print("연산자[+,-,*,/]?");
		oper =(char)System.in.read();
		//연산자 + - * / 가 opre에 들어있음으로 아래 case에서 %c로 표현할 수 있다.
		//("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
		switch(oper) {

		case '+':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));break;
		case '-':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));break;
		case '*':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));break;
		case '/':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));break;
		}



		//else if문으로도 만들수 있다.
		if(oper=='+') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
		}else if(oper=='-') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));
		}else if(oper=='*') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));
		}else if(oper=='/') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));
		}




	}

}
