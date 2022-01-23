package com.day3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int su;

		System.out.print("1~3이내의 수?");// 1,2,3
		su = sc.nextInt();
		//switch ~ case 문은 break가없으면 물흐르듯 해당되는 것을 제외한걸 다 표현한다.
		switch(su) {

		case 3:
			System.out.println("***");break;
		case 2:
			System.out.println("**");break;
		case 1:
			System.out.println("*");break;
		default:	
			System.out.print("숫자입력 오류");
			break;
		}




	}

}
