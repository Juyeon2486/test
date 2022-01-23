package com.day15;

class MyThread1 extends Thread{//java.lang�� Thread�� ��ӹ޾� MyThread1 = Thread�� �ȴ�
	
	private int num;
	private String name;
	
	public MyThread1(int num, String name) {//�����ڷ� �ʱ�ȭ , �޼ҵ忡 �ʱ�ȭ�ص���.
		this.num = num;
		this.name = name;
	} 
 
	@Override
	public void run() {//���⵵ �۾�// ������� �ݵ�� ���̶�� �޼ҵ带 �������̵� �ؾ���.
		
		//Thread method(�ڹ��� VM�� ȣ��)
		
		int i = 0;
		
		while(i<num) {//����ڿ��� �Է¹��� num�� 100�̸�  0~99���� 100�� ������ ��¶�
			
			System.out.println(this.getName()+ ":" + name + i);
			i++;
			
			try {
				sleep(100);//t1 t2�� �ٸ� �޸𸮿� �ö����� t1�� ��� 0.1�� ���� t2�� �۵� �ݴ�� t2�� 0.1�� ���� 0.1�� �۵� ��Ƽ�½�ŷ
				
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test1 {

	public static void main(String[] args) {//���⵵ �۾� ���� ������ �۾��ϰ� ����.

		System.out.println("main ����...");
		
		MyThread1 t1 = new MyThread1(100, "ù��°: ");
		MyThread1 t2 = new MyThread1(200, "�ι�°: ");
		
		t1.start();//t1�� t2�� run���� �ö�. ���� main ���ᰡ ��� �ǰ� 
		t2.start();
		
		
		
		System.out.println("main ����...");
		
		
	}

}
