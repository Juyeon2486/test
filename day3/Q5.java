package com.day3;

public class Q5 {

	public static void main(String[] args) {

		int i, dan;
		for (dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "´Ü]\t");
		}
		System.out.println();
		for (i = 1; i <= 9; i++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + i + "=" + i * dan + "\t");
			}
			System.out.println();
		}
	}
		
	}

