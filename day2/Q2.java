package com.day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
          
		Scanner sc = new Scanner(System.in);
		
	int num1,num2;
	
	//�Է�
	System.out.println("ù��° ��?");
	num1 = sc.nextInt();
	System.out.println("�ι�° ��?");
	num2 = sc.nextInt();
	
	System.out.printf("ū����: %d ",(num1>num2)?num1:num2);
	System.out.printf("��������: %d ",(num1<num2)?num1:num2);
	
	
	}
}
