package com.day15;

import java.util.Calendar;

class MyThread3 implements Runnable{

	@Override
	public void run() {
		 
		while(true) {			//�μ��� �ϳ������� �������� �� 1$ F�� ��¥ T�� �ð�.
			System.out.printf("%1$tF %1$tT\n",Calendar.getInstance());//Ķ������ �ý����� ��¥�� �ð��� ���.
												//getInstance ���� �ð��� �о�´�.
			try {
				Thread.sleep(1000);//1�ʸ���
			} catch (Exception e) { 
			
			}
		}
		
	}
}

public class Test3 {

	public static void main(String[] args) {

		//���� �ý����� ��¥�� �ð��� 1�ʸ��� ����Ͻÿ�.
		
		Thread t = new Thread(new MyThread3());
		t.start();
		
	}

}
