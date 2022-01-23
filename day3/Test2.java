package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//입력한 수까지의 합계를 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum;
		char ch;
		//ch=choice의 약자
		
		while(true) {//무한루프
			
			do {
				System.out.print("원하는 수?"); //100
				su = sc.nextInt();
			}while(su<1||su>5000);
		//do ~ while 문은 우리 생각과 반대 조건을 줄때 안됀다를 생각
			sum=0;
			for(int i=1; i<=su;i++) 
			  sum+=i; //==	//sum=sum+i; 누적
			  
			
			System.out.println("1~" + su + "까지의 합:" + sum);
			
			System.out.println("계속할래?[Y/N]");//Y,y,N,n,b,a,d,f
			ch = (char)System.in.read();
		//!= 는 같지않을때, 양쪽항이 부정이면 ||대신&&를 사용
			if(ch!='Y' && ch!='y') {
				System.out.println("프로그램 종료");
				break;
				
				//while,do~while,for,switch,if에서 break는 반복문을 중지하라는 뜻
			}
		}
	}

}
