package com.day6;

import java.util.Scanner;

class Hap{

	int su,sum;//�ν��Ͻ� ���� 0���� �ʱ�ȭ�Ǿ�����

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�?");
		su = sc.nextInt();


	}

	public int cnt() {

		for(int i=1;i<=su;i++) {
			sum+=i; //sum=sum+i
		}

		return sum;
	}

	public void print(int i) {
		System.out.println("�հ�:" + i);

	}

}

public class Test2 {

	public static void main(String[] args) {
		//int �� int�� Hap���� Hap�� Rect�� Rect�� class�� �ڷ���
		Hap h = new Hap();
		
		h.input();
		int sum = h.cnt();
		h.print(sum);
		//*-*
		//int[] num = new int num[5]
		//Hap h = new Hap();
	}

}
