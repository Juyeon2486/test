package com.day15;


import java.util.Random;
import java.util.Scanner;


class Thread11 extends Thread{

	private static String[] name = 
		{"�����","��  ��","������","������","������",
				"�ڰ���","������","�缼��","��â��","������",
				"������","������","������","�輺��","ä����",
				"������","������","�̳���","���ȯ","���Ѽ�"};
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print("~");
			try {
				sleep(300);
			} catch (Exception e) {
				
			}

		}

	}
}

public class SelectMember {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Thread11 t11 = new Thread11();
		String[] name = {"�����","��  ��","������","������","������",
				"�ڰ���","������","�缼��","��â��","���ֿ�",
				"������","������","������","�輺��","ä����",
				"������","������","�̳���","���ȯ","���Ѽ�"};
		String inwon[];
		int num,su,nameck;

		do {
			System.out.print("��ǥ�� �ο���?");
			num = sc.nextInt();
		}while(num<1||num>20);
		inwon = new String[num];

		su = 0;

		while(su < num) {

			nameck = rd.nextInt(20);
			inwon [su]  = name[nameck];
			for(int i=0;i<su;i++) {
				if(inwon[i].equals(inwon[su])){
					su--;
					break;
				}
			}
			su++;
		}
		System.out.print("�̴���");
		t11.start();
		try {
			t11.join();
		} catch (Exception e) {
			
		}

		int k=1;
		for(String i:inwon) {
			System.out.printf("\n��%d�� ��ǥ�ڡ�:%s",k,i);
			k++;
			
			}
		}
	}

