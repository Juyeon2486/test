package com.day7;

class Rect{
	
	private int w,h;
	
	public void set(int w,int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, double l) {
		System.out.println("����:" + w);
		System.out.println("����:" + h);
		System.out.println("����:" + a);
		System.out.println("�ѷ�:" + l);
	}
	//�ظ޼ҵ� �ߺ� ����(Overloading) (�Ʒ�) 
	//�ϳ��� Ŭ���� �ȿ��� ����� ������ �ϴ� �޼ҵ��� �̸���
	//���� ��Ű�� �۾����� �޼ҵ��� �̸��� ����������
	//��ȣ ���� �μ�(�Ű�����)�ǰ����� �μ��� �ڷ����� �ٸ��� �ָ�
	//���� �ٸ� �޼ҵ�� �ν��� �Ѵ�.
	public void print() {
		System.out.println("����:" + w);
		System.out.println("����:" + h);
	}
	
	public void print(int a) {
		System.out.println("����:" + w);
		System.out.println("����:" + h);
		System.out.println("����:" + a);
	}
	
	public void print (double l) {
		System.out.println("����:" + w);
		System.out.println("����:" + h);
		System.out.println("�ѷ�:" + l);
	}
}

public class Test4 {

	public static void main(String[] args) {

		Rect ob = new Rect();
		
		
	    ob.set(10, 20);
	    int a = ob.area();
		double l = ob.length();
		
		ob.print();
		ob.print(l);
		ob.print(a);
		ob.print(a, l);
		//ob.print(a, l);//���� ���� ���� �ѷ�
		//ob.write();//���� ���� 
		//ob.chul(a);//���� ���� ����
		//ob.jjik(l);//���� ���� �ѷ�
			
	}	

}
