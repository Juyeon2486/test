package com.day10;

class Test{
	
	protected int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("Super Class write()...");
		System.out.println("a: " + a + "b: " + b);
		
	}
	
}

class Demo extends Test{
	
	protected int b = 30, c = 40;
	
	@Override //오버라이드를 하면 형변환을해도 무조건 메소드 자기꺼 사용
	public void write() {
		System.out.println("Sub Class write()...");
		System.out.println("a: " + a + ",b: "+ b + ",c: " + c);
		System.out.println("super.b: " + super.b);//20
	}
	public void print1() {
		System.out.println("Sub Class print1()에서 wirte()호출...");
		write();
	}
	public void print2() {
		System.out.println("Sub Class print2()에서 wirte()호출...");
		super.write();
	}
}

public class Test5 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println("ob.b: " + ob.b);
		System.out.println("((Test)ob).b " + ((Test)ob).b);//super를 밖에다 쓸수 없기에
		//((Test)ob).b Test의 b를 가져온단뜻
		System.out.println("----------------");
		((Test)ob).write();
		
	}

}
