package com.day3;

public class Q1 {

	public static void main(String[] args) {

		int n,sum;

		sum=0;
		for(n=1;n<=100;n+=2) {
			sum+=n;
		}
		System.out.println("Ȧ���� �� ���:" + sum);

		sum=0;
		for(n=0;n<=100;n+=2) {
			sum+=n;
		}
		System.out.println("¦���� ��:" + sum);

		sum=0;
		for(n=1;n<=100;n++) {
			sum+=n;
		}
		System.out.println("1~100���� ��ü�� ��:" + sum);
	}

}
