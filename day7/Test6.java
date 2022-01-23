package com.day7;

import java.util.Scanner;

class RectA{
	
	private int w,h;
	
	public RectA() {
		
	}
	
	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a) {
		System.out.println("가로:" + w);
		System.out.println("세로:" + h);
		System.out.println("면적:" + a);
		
	}
	//메소드 오버로딩
	public void print(int a,int l) {
		System.out.println("가로:" + w);
		System.out.println("세로:" + h);
		System.out.println("면적:" + a);
		System.out.println("둘레:" + l);
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		RectA ob1 = new RectA(); //기본생성자 호출
		ob1.set(10, 20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
		
		System.out.println("-------------");
		
		RectA ob2 = new RectA(100,200);
		a = ob2.area();
		l = ob2.length()	;
		ob2.print(a);
		ob2.print(a, l);
	}

	//Scanner sc = new Scann
	
}
