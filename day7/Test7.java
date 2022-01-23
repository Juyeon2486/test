package com.day7;

public class Test7 {

	int a = 5; //instance변수
	
	{//초기화 블럭
		System.out.println("초기화 블럭 a: " + a);//5
		a = 10;
		System.out.println("초기화 블럭 a: " + a);
	}
	//메소드와 메소드 밖엔 변수만 선언 다른 코딩이 불가능하다.
	
	static int b;
	static {//static 블럭
		b = 10;
		System.out.println("static 블럭 b:" + b);
	}
	//변수:변하는수
	//상수:항상 같은 수
	final int C; //상수 특징:대문자료 표기,만드는 순간에 초기화를 해줘야함
	
	public Test7(){
		System.out.println("생성자...");
		C = 100;
		System.out.println("C:" + C);
	}
	public static void main(String[] args) {

		Test7 ob1 = new Test7();
		Test7 ob2 = new Test7();
	}

}
