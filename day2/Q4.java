package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String str;
		int num1 ,num2;

		System.out.println("ù��° ��?");
		num1 = Integer.parseInt(br.readLine());

		str = num1%2==0?"¦��":"Ȧ��";

		str = num1>0?"���":(num1<0?"����":"��");

		str = num1%4==0 && num1%100!=0 || num1%400==0?"����":"���";

		System.out.println(num1 + "��:" + str);

	}


}
