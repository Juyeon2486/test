package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException  {

		//�غ�(width)�� ����(height)�� �Է¹޾� �ﰢ�� ����(area) ���ϱ�
		//�غ�? : ??
		//����? : ??
		//���� : ??
		//���� = �غ� x ���� / 2

		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));


		double width,height,area;

		//�Է�

		System.out.print("�غ�?");
		width = Double.parseDouble(br.readLine());

		System.out.print("����?");
		height = Double.parseDouble(br.readLine());

		//����

		area = width*height/2;

		//���
		System.out.println("�غ�: " + width);
		System.out.println("����: " + height);
		System.out.println("����: " + area);

		
	}

}
