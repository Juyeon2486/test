package com.day15;

class MyThread2 implements Runnable{

	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name; 
		
	}
	@Override
	public void run() {
		 
		int i = 0;
		
		while (i<num) {
			System.out.println(name + ":" + i);//�������̽����� getName�� ����.
			i++;
			
			try {//Thread�� ��� �޾����� Ʈ����ĳġ���� ������ ���ְ� �������̽��� ��ӹ޾����� Thread.sleep�� �����.
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test2 {

	public static void main(String[] args) {//�����۾��� ������ �۾��ϰ� �ϴ°� Thread��� �Ѵ�.
		
		System.out.println("main ���� ...");
		
		Thread t1 = new Thread(new MyThread2(100, "ù��°...")); //���ʺ�� �����带 ������ ��ü ������ ���ִ� ����.
		Thread t2 = new Thread(new MyThread2(200, "�ι�°..."));

		t1.start();//Thread�� �����ϱ����� ��ŸƮ�� ���־����
		t2.start();
		
		System.out.println("main ���� ...");
	}

}
