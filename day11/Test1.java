package com.day11;

class TestA{
	public void print() {
		System.out.println("AŬ����...");
	}
}

class TestB{
	public void print() {
		System.out.println("BŬ����...");
	}
}

public class Test1 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b = new TestB();
		
		//b = a; TestA�� TestB�� �����Ͱ��� �����ʱ⶧���� �Ұ����ϴ�.
		//b = (TestB)a; ���������� upcast�ؼ� ����ȯ���ص� �Ұ����ϴ�.
		
	}

}
