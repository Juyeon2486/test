package com.day15;

//������ �켱���� (��Ȯ������ ������ ��������� �켱������ ���� ���� �ִ�.
class MyThread4 extends Thread{

	private String name;
	
	public MyThread4(String name) {
		this.name = name; 
		
	}

	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
		
}
public class Test4 {
 
	public static void main(String[] args) {//main Thread 

		MyThread4 ob1 = new MyThread4("A");//Thread0
		MyThread4 ob2 = new MyThread4("B");//Thread1
		MyThread4 ob3 = new MyThread4("C");//Thread2
		
		System.out.println("main ����... ");
		//�켱���� ����(1~10)
		System.out.println("Min: " + Thread.MIN_PRIORITY);//1
		System.out.println("Nor: " + Thread.NORM_PRIORITY);//5(�⺻)���� 5��
		System.out.println("Max: " + Thread.MAX_PRIORITY);//10
		
		//�⺻ �������� �켱����
		System.out.println(ob1.getPriority());//5 �����ö� get
		System.out.println(ob2.getPriority());//5
		System.out.println(ob3.getPriority());//5
		
		System.out.println("main ����... ");
		
		//�켱���� ����
		ob1.setPriority(Thread.MIN_PRIORITY);//�Է��Ҷ� set
		ob2.setPriority(Thread.NORM_PRIORITY);//���ڷ� �ᵵ��.
		ob3.setPriority(Thread.MAX_PRIORITY);
		
		ob1.start();
		ob2.start();
		ob3.start();
		
		
	}

}
