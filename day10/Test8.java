package com.day10;

//추상클래스
//메모리의 낭비없이 클래스와 메소드를 미리 설계
//메소드를 재정의해서 사용
//추상 클래스에는 반드시 하나 이상의 추상 메소드가 있어야하고
//일반 메소드도 만들 수 있다.
abstract class ShapeClass{ //abstract 추상이라는 뜻 추상클래스
	
	abstract void draw();//추상 메소드
	
}

class Circle extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그린다...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다...");
	}
	
}

class Tria extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");
	}
}
public class Test8 {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
	}

}
