package com.day2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//������ ���� �Է¹޾Ƽ� ���� �� ���� ū �� ������ ���(��������)
		//������ ��? 9 5 2
		//���: 2 5 9
		//�񱳴� if������ if n1>n2{�ڸ��ٲ�
		//�ڸ��ٲ� temp = num1; num1 = num2; num2=temp;
		
		Scanner sc = new Scanner(System.in);
		
		int temp,num1,num2,num3;
		
		System.out.print("������ ��?");//9 5 2
	
		num1 = sc.nextInt();//9
		num2 = sc.nextInt();//5
		num3 = sc.nextInt();//2
	
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
        System.out.printf("���: %d %d %d\n",num1,num2,num3);
	    
	    
		
		
		
		
		
		
		
		
	}

}
