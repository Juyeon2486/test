package com.day11;

class TestA{
	public void print() {
		System.out.println("A클래스...");
	}
}

class TestB{
	public void print() {
		System.out.println("B클래스...");
	}
}

public class Test1 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b = new TestB();
		
		//b = a; TestA와 TestB의 데이터값이 같지않기때문에 불가능하다.
		//b = (TestB)a; 마찬가지로 upcast해서 형변환을해도 불가능하다.
		
	}

}
