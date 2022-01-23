package com.day12;

//2.내부클래스(Local)
//메소드안에 클래스를 만들 수 있다.

class Outer2{
	
	static int a = 10; // instance변수
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;//지역(Local)변수
		 
		class Inner2{
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				
				
			}
			
		}
		Inner2 ob = new Inner2();//메소드 안에서만 객체생성 가능
		ob.print();
		
	}

}


public class Test2 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		out.write();
		
		
		
	}

}
