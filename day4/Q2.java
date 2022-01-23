package com.day4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int i,max,min;

		System.out.print("정수 다섯개를 입력하세요:");
		for (i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		max = min = num[0];
		for (i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}

		}
		System.out.println("가장큰수:" + max + "가장 작은수" + min);

		sc.close();





	}

}
