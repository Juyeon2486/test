package com.day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		//�ݺ���(for,while,do~while)
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.println("�� �Է�?");//7
		dan = sc.nextInt();
		// i++ = i+1
		//���۰�,����,�������� �˸� for�� ���
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}		
		
		System.out.println("---------------");
		//while ���� 0���� ��� ���߿� ���� �迭�� ����.
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