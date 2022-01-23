package com.day4;

import java.util.Random;

public class lo {

	public static void main(String[] args) {

		Random rd = new Random();
		int [] num = new int[6];
		int i,j,su,temp;
		su = 0;
		
		while (su<6) {
			num[su] = rd.nextInt(45) + 1;
			for (int n = 0; n<su;n++) {
				if(num[su]==num[n]) {
					su--;
					break;
					
				}
			}
			su++;
			
		}
		for(i=0;i<num.length -1; i++) {
			for(j=1+1;j < num.length;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int n: num) {
			System.out.printf("%4d",n);
			
		}
		System.out.println();
	}

}
