package com.day3;

public class Q1 {

	public static void main(String[] args) {

		int n,sum;

		sum=0;
		for(n=1;n<=100;n+=2) {
			sum+=n;
		}
		System.out.println("홀수의 합 결과:" + sum);

		sum=0;
		for(n=0;n<=100;n+=2) {
			sum+=n;
		}
		System.out.println("짝수의 합:" + sum);

		sum=0;
		for(n=1;n<=100;n++) {
			sum+=n;
		}
		System.out.println("1~100까지 전체의 합:" + sum);
	}

}
