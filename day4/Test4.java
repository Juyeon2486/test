package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//10�� �̳��� �̸��� �������Է¹޾�
		//������ ����������� ������� ������ ���(������������)
		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;

		int i,j,inwon,temp1;
		String temp2;

		do {
			System.out.print("�ο���?[1~10]");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);

		//�迭 �޸� �Ҵ�(=��ü����).
		//new �� ����� �ڷ����� �⺻���� ���ִ�. String=nell,int=0.

		name = new String[inwon];
		score = new int[inwon];

		for(i=0;i<inwon;i++) {
			System.out.print("�̸�?");
			name[i] = sc.next();
			System.out.print("����?");
			score[i] = sc.nextInt();
		}//�Ʒ��ּ��� ��Ƿ� �� for������ �ٿ��� �����ִ�.
		/*System.out.print("�̸�?");//suzi
		name[0] = sc.next();
		System.out.print("����?");//50
		score[0] = sc.nextInt();

		System.out.print("�̸�?");//inna
		name[1] = sc.next();
		System.out.print("����?");//70
		score[1] = sc.nextInt();

		System.out.print("�̸�?");//lisa
		name[2] = sc.next();
		System.out.print("����?");//100
		score[2] = sc.nextInt();*/

		//���� ����

		for(i=0;i<score.length-1;i++) {

			for(j=i+1;j<score.length;j++) 

				//System.out.println(i + " : " + j);
				if(score[i]<score[j]) {

					temp1 = score[i];
					score[i]  = score[j];
					score[j]  = temp1;

					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
		}
		//�ΰ��� �迭�� �Է��ؾ� �Ҷ� Ȯ�� for �� ��� �Ұ� �Ѱ��� �迭�� Ȯ��for�� ��밡��.
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s %4d\n",name[i],score[i]);
		}
	}
}