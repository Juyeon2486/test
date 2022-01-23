package com.day15;

class MyThread5 implements Runnable{//���ø���Ʈ ���ʺ�� �����

	@Override
	public void run() {//���� �������̵� �ؼ� ������ �ְ� �Ʒ� ���������� �����Ѵ�.
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(i);
			
			try { 
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
	
	
}
public class Test5 {

	public static void main(String[] args) {

		System.out.println("main ���� ...");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5()); 
		
		//DemonThread : �ٸ� �����忡 ������ �ִ� �������
		//�ٸ� �����尡 ����Ǹ� ���󽺷��尡 ������� �ʴ���
		//���μ����� ����ȴ�.
		//DemonThread�� join ���־��� ������� ���־��� �ɼ��̴�.
		t1.setDaemon(true);//���󽺷���� �����带 ����ԵǸ� ���ν����尡 
		t2.setDaemon(true);//����Ǹ� �ٸ� ������鵵 ����ȴ�.
		t3.setDaemon(true);//���󽺷����� �⺻���� flase�̹Ƿ� true���� �־���.
		
		
		t1.start();//���󽺷���� ������ ������ ���ν����尡 ����Ǿ
		t2.start();//������ ��������� ������ ���� �۵��ȴ�.
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {//main���� 1000(1��)�� ����� ��� Ʈ����ĳġ��.
			
		}
		
		try {//DemonThread�� �ɼ�.
			t1.join();//���ο��� t1,t2,t3�� ������ ���� ��ٸ���� ��ɾ�
			t2.join();//�� �ٽ����ʿ���� �ʿ��Ѱ͸�. �� sleep ��ɾ ���ǹ�������.
			t3.join();//�� Ʈ���� ĳġ�� �ȿ� ���־����.
		} catch (Exception e) {
			
		}
		
		System.out.println("main ���� ...");
		
	}

}
