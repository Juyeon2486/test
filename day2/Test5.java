package com.day2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		
		System.out.print("이름?");//lisa
		name = sc.next();
		
		System.out.print("국어?");//50
		kor = sc.nextInt();
		
		String pan;
		//값이 큰걸 위에 쓰고 낮은순으로 적는다. else if문
		if(kor>=90) {
			pan = "수";
		}else if(kor>=80) {
			pan = "우";
		}else if(kor>=70) {
			pan = "미";
		}else if(kor>=60) {
		    pan = "양";
		}else {
			pan = "가";
		}
		
		System.out.println(name + ":" + pan);
		
	
		
	}

}
