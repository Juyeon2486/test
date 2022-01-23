package com.day9;

class Test{
	
	private String title;
	protected double area;
	
	public Test() {}
	
	public Test(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
		
	}
	
}

class Circle extends Test{
	
	private int r;
	protected static final double PI=3.14;
	//위에 부모가 기본생성자를 갖고있기에 에러가 생기지않는다.
	public Circle(int r) {
		super("원"); //생성자는 선두에 한번만 호출
		this.r = r;
	}
	
	public void circleArea() {
		area = (double)r*r*PI;
	}
	
}

class Rect extends Test{
	
	private int w,h;
	
	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		
		area = w*h;
	}


	
	//override
	//상속관계에서 같은 역할을 하는 메소드의 이름을 통일시키는 작업.ㅎ 
	//부모의 클래스를 재정의(다형성)해서 사용
	//메소드의 이름이 부모 메소드와 정확히 같아야한다.
	
	@Override
	public void write() {
		System.out.println("가로:" + w + ",세로:" + h);
		System.out.println("넓이:" + area);
		//super.write();
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(10);
		ob1.circleArea();
		ob1.write();
		
		Rect ob2 = new Rect();
		ob2.rectArea(10, 20);
		ob2.write();
	}

}
