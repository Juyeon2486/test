package com.day12;

//1.내부클래스(Inner)
//클래스안에 클래스.
class Outer1{
	
	static int a = 10;
	int b = 20;
	
	public class Inner1{//종종 씀. //클래스안에 클래스를 만들 수 있다.
		
		int c = 30; //변수선언 
 		
		public void write() { //메소드 외부클래스(Outet1)를 객체 생성해야만 내부클래스(Inner)객체 생성을 할 수 있다.
							  //내부클래스만 단독으로 객체생성할 수 없다. 상속 관계는 아님.
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}
		
	}
	
	public void print() {
		Inner1 ob = new Inner1();
		ob.write();
		
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		out.print();
		
		Outer1.Inner1 in = out.new Inner1();
		in.write(); //순서만 따져보면 이해가능.
		
		
		
		
		

	}

}
