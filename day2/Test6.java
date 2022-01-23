package com.day2;

import java.util.Scanner;

//Scanner는 단락문자를 구분해서 데이터를 입력
//기본 단락은 공백

public class Test6 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	//변수
	String name;
	int kor,eng,mat;
	
	System.out.print("이름 국어 영어 수학?");//suzi 40 50 70
	//System.out.print("이름,국어,영어,수학?");//suzi,40,50,70
	
	//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
	// \\s*,\\s* 는 공백 \\s* 같은 기호를 정규화 표현식이라고 하며 모든언어에서 공통적으로 사용한다.
	
	name = sc.next();
	kor = sc.nextInt();
	eng = sc.nextInt();
	mat = sc.nextInt();
	
	System.out.println(name + ":" + (kor+eng+mat) + "점");
	
	
		
		
		
	}

}
