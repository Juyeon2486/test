package com.day3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		//배열
		//int num[] = new int[5];
		int[] num = new int[5];//

		Scanner sc = new Scanner(System.in);

		System.out.print("5개의 정수?");//5 7 9 2 3

		//for문을 사용하여 반복으로 나오는 행을 줄일 수 있다.
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}

		for(int i=0;i<num.length;i++) {
			System.out.println("num[" + i + "]:" + num[i]);
		}

		System.out.println("배열 갯수: " + num.length);
		// 중간에 num을 다시 설정하여 바꿀 수도 있다.
		num[3] = 100;
		System.out.println("num[3]:" + num[3]);
		
		int a = num[3] - 30;
		System.out.println("a:" + a);
		
		
		
		
	}

}
