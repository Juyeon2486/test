package com.day7;

//1.static�� new�� ��������ʾƵ� �˾Ƽ� �޸𸮷� �ö󰣴�.
//2.static�� ��ü�� 100�� �����ǵ� �޸� ������ 1���� �����ȴ�.

public class Test2 {

	public static int a = 10; //class���� instance�������ƴ�(static���θ����)
	//Ŭ�������� �Ǵ� Ŭ���� �޼ҵ�� Ŭ������ �ε��Ǵ� ����
	//�޸� �Ҵ��� �̷������ [Ŭ���� �̸�.��ü]�� ���� ������ �� �ִ�. 
	//��, new�� ���� �޸� �Ҵ��� ���� �ʾƵ� ��� �����ϴ�.
	
	private int b = 20; // instance����
	//�ν��Ͻ����� �Ǵ� �ν��Ͻ��޼ҵ�� new�� ���� �޸� �Ҵ���
	//�޾ƾ߸� ��� �����ϰ� �ٸ� �޼ҵ忡�� ���� ����������
	//Ŭ���� �޼ҵ忡���� ������ �Ұ����ϴ�.
	//����(f11)=�ε� ��ü�������� �ٸ���.
	public void write() {//instance �޼ҵ�
		
		System.out.println("class ���� a:" + a );
		System.out.println("instance ���� b: " + b);
		
	}
	
	public static void print() {//class �޼ҵ�
		
		System.out.println("class ���� a:" + a );
		//�����Ͽ���//System.out.println("instance ���� b: " + b);
		
	}
	
	public static void main(String[] args) {

		System.out.println("class ���� a:" + a);//10
		System.out.println("class  ���� a:" +Test2.a);//10
		
		//write();
		print();
		Test2.print();//10
		
		Test2 ob1 = new Test2();
		
		System.out.println("class ���� a:" + ob1.a);
		System.out.println("instance ���� b:" + ob1.b);//20
		ob1.print();
		ob1.write();
		
		System.out.println("---------------");
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		ob2.write();
		System.out.println("---------------");
		Test2 ob3 = new Test2();
		ob3.a = 1000;
		ob3.b = 2000;
		ob3.write();
		System.out.println("---------------");
		ob1.write();
		ob2.write();
		ob3.write();
	}

}