package com.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		String name;
		int kor,eng,mat,tot,arae;;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름?");
		name = sc.next();
		System.out.print("세과목 점수?");
		kor = sc.nextInt(); eng = sc.nextInt(); mat =sc.nextInt();
		
		String pan = "";
		tot = kor+eng+mat;
		arae = (tot/3);
		
		if(kor>=40||eng>=40||mat>=40&&arae>=60) {
			pan = "합격";
		}
		
		if(kor<40||eng<40||mat<40&&arae>=60) {
			pan = "과락";
		}
		
		if(arae<60) {
			pan = "불합격";
		}
		
		System.out.printf("이름: %s \n" + "총점:%d " + "평균:%d " + "판정:%s"
							,name,tot,arae,pan  );
	}

}
