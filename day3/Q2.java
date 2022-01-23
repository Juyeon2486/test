package com.day3;

public class Q2 {

	public static void main(String[] args) {

		int count =0;
		
		for(int i =1; i <= 100; i++) {
			if(i % 3 == 0) {
				count++;
				System.out.println(i);
			}
		}	
		System.out.println("3의 배수의 갯수:" + count);
		
	}

}
