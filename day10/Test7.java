package com.day10;

//final은 대문자로 써줘야함
//인스턴스변수에 final을 붙이면 단 한번만 초기화가 가능.
//메소드에 final을 붙이면 Override가 불가능 하다.
//클래스에 final을 붙이면 상속이 불가능 하다. 

//final class TestA{
class TestA{

	public static final double PI;
	
	static {
		PI = 3.14;
	}
	
	public double area;
	
	public final void write(String title) {
		System.out.println(title + ":" + area);
	}
	
}


public class Test7 extends TestA{

	//@Override
	//public void write(String title) {


	public void circleArea(int r) {
		area = (double)r*r*PI;
	}
	
	public static void main(String[] args) {

			Test7 ob = new Test7();
			ob.circleArea(10);
			ob.write("원");
		
	}

}
