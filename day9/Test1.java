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
	//���� �θ� �⺻�����ڸ� �����ֱ⿡ ������ �������ʴ´�.
	public Circle(int r) {
		super("��"); //�����ڴ� ���ο� �ѹ��� ȣ��
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
	//��Ӱ��迡�� ���� ������ �ϴ� �޼ҵ��� �̸��� ���Ͻ�Ű�� �۾�.�� 
	//�θ��� Ŭ������ ������(������)�ؼ� ���
	//�޼ҵ��� �̸��� �θ� �޼ҵ�� ��Ȯ�� ���ƾ��Ѵ�.
	
	@Override
	public void write() {
		System.out.println("����:" + w + ",����:" + h);
		System.out.println("����:" + area);
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