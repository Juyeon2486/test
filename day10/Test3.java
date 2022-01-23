package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//년월을 입력받아,Calendar로 만년달력을 만들기.
		Scanner sc = new Scanner(System.in);
		int y,m,d;
		Calendar now = Calendar.getInstance();
		
		do {
			System.out.println("년도?");
			y = sc.nextInt();
		}while (y<1);
		
		do {
			System.out.println("몇월?");
			m = sc.nextInt();
		}while (m>12||m<1);
			
		now.set(y, m-1, 1);
		d = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		for(int i =0; i<d -1; i++) {
			System.out.println("\t");
		}
		
		for(int i =1; i<=now.getActualMaximum(Calendar.DAY_OF_WEEK); i++) {
			if(d % 7 != 0) {
				System.out.println(i + "\t");
			}else if (d % 7 ==0){
				System.out.println(i);
			}
			d++;
		}
		if (d % 7 != 1) {
			System.out.println();
		}
	System.out.println("------------------------------");
	}

}
