package com.day11;

class SuperTest{
	
	public int a=10,b=20;
	
	public void write() {
		System.out.println("����Ŭ���� write() �޼ҵ�...");
	}
	
	public int hap() {
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b=100,c=200;
	
	public void print() {
		System.out.println("����Ŭ���� print() �޼ҵ�...");
	}

	@Override
	public int hap() {
		return a + b + c; //310
	}

}


public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		System.out.println(ob1.b); //100
		
		SuperTest ob2 = ob1; //upcast ob1�� ob2�� �������� �ڽ��� �θ�ȭ ��Ű�� ��ĳ��Ʈ
		System.out.println(ob2.b);//20
		
		System.out.println(ob2.hap());//ob2�� hap �����͵� ob1 �����׽�Ʈ�� hap�ֱ⶧���� 
									  //�θ�� �ڽ��� �Ѵٰ����������� ������ �ڽĲ� �����Ѵ�
		ob2.write();
		
		//ob2.print(); //4 ������ ������. ob2�� �θ��̱⿡ �ڽĲ� �θ� ����Ҽ�����
		
		((SubTest)ob2).print(); //downcast �θ� �ڽ����� �ٲٴ� ��.
	}

}
