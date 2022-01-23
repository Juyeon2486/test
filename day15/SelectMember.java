package com.day15;


import java.util.Random;
import java.util.Scanner;


class Thread11 extends Thread{

	private static String[] name = 
		{"전상원","박  범","김찬주","진현주","남승은",
				"박가윤","서동혁","양세리","김창훈","이주현",
				"왕혜민","이종원","장하은","김성제","채현우",
				"이윤재","전성덕","이나영","배승환","이한솔"};
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
		String[] name = {"전상원","박  범","김찬주","진현주","남승은",
				"박가윤","서동혁","양세리","김창훈","이주연",
				"왕혜민","이종원","장하은","김성재","채현우",
				"이윤재","전성덕","이나영","배승환","이한솔"};
		String inwon[];
		int num,su,nameck;

		do {
			System.out.print("발표할 인원수?");
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
		System.out.print("뽑는중");
		t11.start();
		try {
			t11.join();
		} catch (Exception e) {
			
		}

		int k=1;
		for(String i:inwon) {
			System.out.printf("\n★%d번 발표자★:%s",k,i);
			k++;
			
			}
		}
	}

