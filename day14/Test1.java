package com.day14;

class Box<T>{
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();
		b1.set(10);  //auto-Boxing //���ÿ����� �� ��������
		//Integer�� int�� �Ȱ���. int�� ���ÿ��� integer�� ������ �޼ҵ�
		int i = b1.get();//auto-unBoxing �������� ���ÿ�������
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		//b2.set(10); �ڷ����� String���� ������� ������ ����
		b2.set("����");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box<>(); //�ڷ����� �ƹ��͵� ���������� ������Ʈ.
		b3.set(30);
		Integer ii = (Integer)b3.get();//�ڷ����� �ƹ��͵� �����ʾ� ������Ʈ�� ��������⿡
		//�ٿ� ĳ������ �Ͽ� ��Ƽ�� ���� �޾ƿ´�
		System.out.println(ii);
				
		
		
	}

}
