package com.day6;

import java.util.Scanner;

class Hap{

	int su,sum;//인스턴스 변수 0으로 초기화되어있음

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력?");
		su = sc.nextInt();


	}

	public int cnt() {

		for(int i=1;i<=su;i++) {
			sum+=i; //sum=sum+i
		}

		return sum;
	}

	public void print(int i) {
		System.out.println("합계:" + i);

	}

}

public class Test2 {

	public static void main(String[] args) {
		//int 는 int만 Hap에는 Hap만 Rect는 Rect만 class는 자료형
		Hap h = new Hap();
		
		h.input();
		int sum = h.cnt();
		h.print(sum);
		//*-*
		//int[] num = new int num[5]
		//Hap h = new Hap();
	}

}
