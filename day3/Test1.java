package com.day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		//반복문(for,while,do~while)
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.println("단 입력?");//7
		dan = sc.nextInt();
		// i++ = i+1
		//시작값,끝값,증가값을 알면 for문 사용
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}		
		
		System.out.println("---------------");
		//while 문은 0부터 사용 나중에 나올 배열과 관련.
		int j=0;
		while(j<9) {
			j++;
			System.out.println(dan + "*" + j + "=" + (dan*j));
			
		}
		
		System.out.println("---------------");
		
		int k=0;
		do {
		    k++;
		    System.out.println(dan + "*" + k + "=" + (dan*k));
		}while(k<9);
		
		
		
		
		
	}

}
