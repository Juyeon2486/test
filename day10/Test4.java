package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//��,��,���� �Է¹޾� 100(X)���� �����(����)
		/*�⵵?2016
		��?4
		��?20
		������?100

		�� �� �� : 2016�� 4�� 20�� ������
		100�� �� : 2016�� 7�� 29�� �ݿ���
		*/
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		int y,m,d,w,h,x;
		String[] yoil = {"��","��","ȭ","��","��","��","��"};
		
		do {
			System.out.println("�⵵?");
			y = sc.nextInt();
		}while (y<1);
		
		do {
			System.out.println("���?");
			m = sc.nextInt();
		}while (m<1||m>12);
		
		do {
			System.out.println("����?");
			d = sc.nextInt();
		}while (d<1||d>31);
		
		System.out.println("���� ��?");
		h = sc.nextInt();
		
		now.set(y, m-1, d);
		x = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("������:" + y + "-" + m + "-" + d + "-" + yoil[x-1] + "����");
	
		int year = now.get(Calendar.YEAR);//����
		int month = now.get(Calendar.MONTH)+1;//�� (0~11) +1���������ν� (1~12)�� ���̰�����
		int date = now.get(Calendar.DATE);//��
		int week = now.get(Calendar.DAY_OF_WEEK);//���� ��(1~7)���� ��ȯ 1:�Ͽ���~7:����� ���ڵ��� 0~6��ȯ Ķ���� �޼ҵ�� 1~7 ��ȯ
	
		System.out.println(h + "����" + year + "-" + month + "-" + date + "-" + yoil[week-1] + "����");
	}

}
