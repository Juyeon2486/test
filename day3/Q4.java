package com.day3;

public class Q4 {

	public static void main(String[] args) {

		int i,dan;
		for (dan = 2; dan <=5; dan++) {
			System.out.print(dan + "´Ü\t");
		}
		System.out.println();
		for (i = 1; i <= 9; i++) {
			for (dan = 2; dan <= 5; dan++) {
				System.out.printf("%d*%d=%d",dan,i,(dan*i));
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();

		for (dan = 6; dan <=9; dan++) {
			System.out.print(dan + "´Ü\t");
		}
		System.out.println();
		for (i = 1; i <= 9; i++) {
			for (dan = 6; dan <= 9; dan++) {
				System.out.printf("%d*%d=%d",dan,i,(dan*i));
				System.out.print("\t");
			}
			System.out.println();

		}
	}
}
