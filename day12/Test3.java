package com.day12;

//3. 내부클래스(중첩)
//static으로 클래스 만들기.

class Outer3{
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		
		int c = 30; 
		
		public void write() {
			
			System.out.println(a);
			//System.out.println(b); b는 static이 아니기때문에 객체생성을 해주어야하기때문에 에러가남.
			System.out.println(c);//a와c는 static이기때문에 상관없다.
			
			Outer3 ob = new Outer3();
			System.out.println(ob.b);
			
			
			
		}
		
		
	}
	
	public void print() {
		System.out.println(b);
	}
}


public class Test3 {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		out.print();
	
	}

}
