package com.day7;

//this : 클래스 이름(ME) Cricle.r = this.r 이지만 
//클래스명을 클래스안에 중복시키지 않기 위해 Cricle.r이 아닌 this.r로 표기한다.


class Circle{
	
	private int r; // 정보의 은닉화(캡슐화)
	//일반적으로 값을 넣을땐 set을 많이쓰고 가져올땐 get을 많이 쓴다.
	public void setData(int r) { //setData(int r,Circle This
		//private 에 다이렉트로 접근못하므로 우회도로를 만들어준다.
		this.r = r;
	}
	
	public double area() {
		return this.r*this.r*3.14;
	}
	
	public void print(double area) {//result(double area, Cricle this)
		System.out.println("반지름:" + this.r);
		System.out.println("넓이: " + area);
		
		
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		ob.setData(10);//인간은 10만 보이지만 자바는 주소(내부적으로)를 가지고있다 ob.setData(10,ob);
		double result = ob.area();//ob.area(ob)
		ob.print(result);//print(result,ob)
		
		ob.setData(100);
		result = ob.area();
		ob.print(result);
		
		
	}

}
