package com.day5;

import java.util.Scanner;

public class Rect2 {

	String name;
	int kor,eng;
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�?");
		name = sc.next();
		System.out.println("����?");
		kor = sc.nextInt();
		System.out.println("����?");
		eng = sc.nextInt();
	
	}
	public int tot() {
		
		int result;
		result = kor+eng;
		return result;
	}
	
	public void print(int j) {
	
		System.out.println("����:" + j + "��");
	}
	
}
