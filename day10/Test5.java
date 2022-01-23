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
	
	@Override //�������̵带 �ϸ� ����ȯ���ص� ������ �޼ҵ� �ڱⲨ ���
	public void write() {
		System.out.println("Sub Class write()...");
		System.out.println("a: " + a + ",b: "+ b + ",c: " + c);
		System.out.println("super.b: " + super.b);//20
	}
	public void print1() {
		System.out.println("Sub Class print1()���� wirte()ȣ��...");
		write();
	}
	public void print2() {
		System.out.println("Sub Class print2()���� wirte()ȣ��...");
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
		System.out.println("((Test)ob).b " + ((Test)ob).b);//super�� �ۿ��� ���� ���⿡
		//((Test)ob).b Test�� b�� �����´ܶ�
		System.out.println("----------------");
		((Test)ob).write();
		
	}

}
