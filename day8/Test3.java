package com.day8;
//��ӿ����Ѽ��� 12/31
//��� (�θ� �ڽ����� �ִ°�) (�����޴°�)
//1.�θ𲨴� ������  (����� ����)
//2.private�� �����Ѱ��� ����� �Ұ����ϴ�.
//3.protected�� �����Ѱ��� ����� �����ϴ�.
//4.������ ������.
//5.�θ�� �ڽ��� ���� ��ü�� ������ ������ ������ ������ ����. 

class TestB {

	private String title;
	protected int area;//3.protected�� �����Ѱ��� ��� �����ϴ�. 37����

	public void set(String title) {
		this.title = title;
		//this.area = area;

	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}
//Ŭ������Ŭ������ �����λ���
class RectB extends TestB{

	private int w,h;//10,20

	public RectB(int w, int h) { //10,20
		this.w = w;
		this.h = h;		
	}

	public void rectArea() {
		area = w*h; //(area = w*h)_2.private�� �����Ѱ��� ��� �Ұ���
		set("�簢��");   //1.�θ𲨴� ������
	}

}

public class Test3 {

	public static void main(String[] args) {

		RectB ob = new RectB(10, 20);

		ob.rectArea();
		ob.print();//1.�θ�Ŵ� ������.






	}

}
