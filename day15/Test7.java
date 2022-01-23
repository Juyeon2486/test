package com.day15;

//���ͷ�Ʈ : �켱������ ���� ���α׷��� ���� ���� ��Ű�� ���ƿ�. �켱������ ����ڰ� �����ش�.

class MyThread7 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++) {
			
			try {
				sleep(2000); //2�� �����
			} catch (Exception e) {
				
			}
			
			System.out.println(getName() + ":" + i);
			
			if(next.isAlive()) {//���� ���罺���尡 ��������� ������
				next.interrupt();// ���� �����带 ����.
			}
		}
	}
}

public class Test7 {

	public static void main(String[] args) {
		
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
	
		t1.setNext(t2); //�켱 ������ ���Ѱ� t1�� �����ϴ� ���߰� t2, t2�����ϴ� ���߰� t3, t3�����ϴٸ��߰� t1
		t2.setNext(t3);
		t3.setNext(t1);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt(); //������� ����ǰԲ� ������ ������ �� �ִ�. ������� ���������� �˾Ƹ��α�. ���ͷ�Ʈ.
		
		try {
			
			t1.join();
			t2.join();//main �޼ҵ����� t1 , t2, t3 �� ������ ���� ��ٷ���� ��ɾ�.
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
