package com.day8;
//��ӿ����Ѽ��� 12/31
//��� (�θ� �ڽ����� �ִ°�) (�����޴°�)
//1.�θ𲨴� ������  (����� ����)
//2.private�� �����Ѱ��� ����� �Ұ����ϴ�.
//3.protected�� �����Ѱ��� ����� �����ϴ�.
//4.������ ������.
//5.�θ�� �ڽ��� ���� ��ü�� ������ ������ ������ ������ ����. 

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
//Ŭ������Ŭ������ �����λ���
class Rect extends TestA{
	
	private int w,h;//10,20
	
	public Rect(int w, int h) { //10,20
		this.w = w;
		this.h = h;		
	}
	
	public void rectArea() {
		int a = w*h;
		set("�簢��", a);   //1.�θ𲨴� ������
	}
	
	
}


public class Test2 {

	public static void main(String[] args) {
		
		Rect ob = new Rect(10, 20);
		
		ob.rectArea();
		ob.print();
		
		
		
		
		
	}

}
