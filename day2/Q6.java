package com.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		String name;
		int kor,eng,mat,tot,arae;;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�?");
		name = sc.next();
		System.out.print("������ ����?");
		kor = sc.nextInt(); eng = sc.nextInt(); mat =sc.nextInt();
		
		String pan = "";
		tot = kor+eng+mat;
		arae = (tot/3);
		
		if(kor>=40||eng>=40||mat>=40&&arae>=60) {
			pan = "�հ�";
		}
		
		if(kor<40||eng<40||mat<40&&arae>=60) {
			pan = "����";
		}
		
		if(arae<60) {
			pan = "���հ�";
		}
		
		System.out.printf("�̸�: %s \n" + "����:%d " + "���:%d " + "����:%s"
							,name,tot,arae,pan  );
	}

}
