package com.day3;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int su;

		System.out.print("1~3�̳��� ��?");// 1,2,3
		su = sc.nextInt();
		//switch ~ case ���� break�������� ���帣�� �ش�Ǵ� ���� �����Ѱ� �� ǥ���Ѵ�.
		switch(su) {

		case 3:
			System.out.println("***");break;
		case 2:
			System.out.println("**");break;
		case 1:
			System.out.println("*");break;
		default:	
			System.out.print("�����Է� ����");
			break;
		}




	}

}
