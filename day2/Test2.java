package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//System.in �� 1byet InputStreamReader�� 2byte�� ������ش�.
		//InputStreamReader�� �긴�� ����
		int num1,num2;
		
		System.out.println("ù��° ��?");//20
		num1 = Integer.parseInt(br.readLine());
		
		System.out.println("�ι�° ��?");//5
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d + %d = %d\t",num1,num2,(num1+num2));
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf("%d * %d = %d\t",num1,num2,(num1*num2));
		System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));	
		System.out.printf("%d %% %d = %d\n",num1,num2,(num1%num2));
		
		
		System.out.println("num1>num2: " + (num1>num2));
		System.out.println("num1==num2: " + (num1==num2));
		//���ڸ� ��ȣ�� �ε�ȣ( ==,>,<,>=,<= )�� �����ϸ� true,false�� ���� 
		
		
		String str;
		
		//���׿�����(����? true��:false��)
		str = num1%2==0?"¦��":"Ȧ��";
              //(����)	
		str = num1>0?"���":(num1<0?"����":"��");
		
		//A and(&&) B : A�� true�̰� B�� true
		//A or(||) B : A�� true,B��  true, �Ѵ� true
		str = num1%4==0 && num1%100!=0 || num1%400==0?"����":"���";
		//������ ���ϴ� ���ġ� ������ 4�⸶�� ���ƿ�
		System.out.println(num1 + ":" + str);
		
	
	
	}

}
