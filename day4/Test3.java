package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Selcetion Sort
		//ù��°�� ���������� or ū������ �������� ��������.
		
		/* ��������� 5���� �Է¹ޱ����� int[5]�� 5���� ���� ������ְ� �Է�
		int[] num = new int[5];
		int i,j,temp;
		
		System.out.print("�ټ����� ����?");// 5 6 5 1 4
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		*/
		
		
		
		int[] num = new int[5];
		int i,j,temp;
		
		System.out.print("�ټ����� ����?");// 5 6 5 1 4
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//Selcertion Sort�� ���� �Ʒ� �ܿ���		//
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
		//Ȯ��for�� �迭�϶��� ��� �׿ܴ� ���۰�,����,�������� �˾ƾ���.
		System.out.print("Sorted Data: ");
		for(int k : num) {
			System.out.printf("%4d",k);
		}
		System.out.println();
		
	}

}
