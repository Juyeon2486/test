package com.day4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int y,m,nalsu,i,week,day;
		String w[] = {"��","��","ȭ","��","��","��","��"};

		do {
			System.out.print("�⵵?");//2018
			y=sc.nextInt();
		}while(y<1);
		do {
			System.out.println("��?");//12
			m = sc.nextInt();
		}while (m <1||m>12);
		do {
			System.out.println("��?");//31
			day = sc.nextInt();
		}while (day<1||day>months[m-1]);
		if (y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		nalsu = (y-1)*365 + (y-1)/4 - (y - 1)/100+(y -1)/400;
		for(i=0;i<m-1;i++) {
			nalsu+= months[i];
		}
		nalsu += day;
		week = nalsu %7;
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.",y,m,day,w[week]);





	}


}
