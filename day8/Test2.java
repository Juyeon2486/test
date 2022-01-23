package com.day8;
//상속에대한수업 12/31
//상속 (부모가 자식한테 주는것) (물려받는것)
//1.부모꺼는 내꺼다  (상속의 조건)
//2.private로 선언한것은 상속이 불가능하다.
//3.protected로 선언한것은 상속이 가능하다.
//4.내꺼는 내꺼다.
//5.부모와 자식이 같은 객체를 가지고 있으면 무조건 내꺼를 쓴다. 

class TestA {
	
	private String title;
	private int area;
	
	public void set(String title, int area) {
		this.title = title;
		this.area = area;
		
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
	
}
//클래스와클래스는 남남인사이
class Rect extends TestA{
	
	private int w,h;//10,20
	
	public Rect(int w, int h) { //10,20
		this.w = w;
		this.h = h;		
	}
	
	public void rectArea() {
		int a = w*h;
		set("사각형", a);   //1.부모꺼는 내꺼다
	}
	
	
}


public class Test2 {

	public static void main(String[] args) {
		
		Rect ob = new Rect(10, 20);
		
		ob.rectArea();
		ob.print();
		
		
		
		
		
	}

}
