package com.day3;

public class Test5 {

	public static void main(String[] args) {

		int i,j;

		/*		for(i=1;i<=5;i++) {

			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}

			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for(i=5;i>=1;i--) { //i-- = i=i-1

			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}

			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}*/

		/*for(i=1;i<=5;i++) {

			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
		//i*2-1 어떤수든 *2-1을 하면 홀수가됀다	
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();

		}

        for(i=5;i>=1;i--) {

			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}

			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();*/




		for(i=5;i>=1;i--) {

			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}

			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for(i=2;i<=5;i++) {

			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			//i*2-1 어떤수든 *2-1을 하면 홀수가됀다	
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();





		}

	}
}