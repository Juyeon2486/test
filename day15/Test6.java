package com.day15;

//������ TTL(Time To Live)

class MyThread6 extends Thread{
	
	@Override
	public void run() { 
		
		try {
			System.out.println("������ ���� ... ");
			
			System.out.println("�켱����: " + getPriority());
			System.out.println("�������̸�: " + getName());//�������� getName.
			
			//0.5�� �����
			sleep(500); // sleep�� �ݵ�� Ʈ���� �ȿ� �����־���Ѵ� �ȱ׷��� ����.
			
			//�켱���� ����
			setPriority(2);
			System.out.println("����� �켱 ����: " + getPriority());
			
			System.out.println("������ ���� ... ");
			
		} catch (Exception e) {
			
		}
	}
}
public class Test6 {
 
	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread(); //���� Thread�� t1�� �־�� ���� Thread�� main.
		Thread t2 = new MyThread6();
															//�⺻�켱����ȣ��
		System.out.println("���� ������ �켱 ����: " + t1.getPriority());//5 //��� �������� �켱������ 5 �̴�.
		System.out.println("���� �������� �̸�: " + t1.getName());//main
		System.out.println("t2�������� �̸�: " + t2.getName());//Thread-0
		
		System.out.println("t2.start() �޼ҵ� ȣ������ isAlive:" + t2.isAlive());//t2�� ����ֳ� ��¶�. flase�� ���� t2.strat�� ���⶧��
		
		t2.start();
		
		//t2�켱����
		System.out.println("t2 �켱����: " + t2.getPriority());
		
		//t2�� �켱���� ����
		t2.setPriority(1);//�켱������ 5���� 1�� �ٲ�
		
		try {
			
			//0.1�� ���Բ� ����.
			Thread.sleep(100); //������ ���� x10 �� ��
			
			//t2 ����Ȯ��
			System.out.println("t2 ����ֳ�? " + t2.isAlive());
			
			//1�� ���Ը���
			Thread.sleep(1000);//���� �ִµ��� �ٸ� �۾�. �׷��Ƿ� ���Ʒ��� �̵��ϸ� �۾�.
								//������ ���ؼ� ������ �ٲ���.
			System.out.println("1�� sleep�� t2 ����ֳ�? " + t2.isAlive());
			
			t2.join();
			
			System.out.println("�׷��� ����ֳ�? " + t2.isAlive());
			
			
		} catch (Exception e) {
			
		}
		
		
		
	}

}
