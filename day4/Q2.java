package com.day4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int i,max,min;

		System.out.print("���� �ټ����� �Է��ϼ���:");
		for (i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		max = min = num[0];
		for (i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}

		}
		System.out.println("����ū��:" + max + "���� ������" + min);

		sc.close();





	}

}
