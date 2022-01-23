package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Selcetion Sort
		//첫번째수 작은수부터 or 큰수부터 오름차순 내림차순.
		
		/* 사용자한테 5개를 입력받기위해 int[5]로 5개의 방을 만들어주고 입력
		int[] num = new int[5];
		int i,j,temp;
		
		System.out.print("다섯개의 정수?");// 5 6 5 1 4
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		*/
		
		
		
		int[] num = new int[5];
		int i,j,temp;
		
		System.out.print("다섯개의 정수?");// 5 6 5 1 4
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//Selcertion Sort의 공식 아래 외우기★		//
		for(i=0;i<num.length-1;i++) {
			
			for(j=i+1;j<num.length;j++) {
				
				//System.out.println(i + " : " + j);
				if(num[i]>num[j]) {
					
					temp = num[i];
				 num[i]  = num[j];
			     num[j]  = temp;
					
				}
			}
		}
		//확장for문 배열일때만 사용 그외는 시작값,끝값,증가값을 알아야함.
		System.out.print("Sorted Data: ");
		for(int k : num) {
			System.out.printf("%4d",k);
		}
		System.out.println();
		
	}

}
