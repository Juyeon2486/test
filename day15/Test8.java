package com.day15;

class MyThread8 implements Runnable{
	
	private int bank = 10000;
	
	private int getBank() {
		return bank;
		
	}
	
	private int drawMoney(int m) {
		bank-=m; //bank-=  = bank-m; //����
 		return m; //���� �ݾ�
	}

	@Override
	public void run() {
		
		int moneyNeed = 6000; //������ �ݾ�
		int money;
		String msg = "";
		
		try {
			//�ݾ��� ũ�ų� ������ ����.
			synchronized (this) {//*����ȭ��. ������ �����ش�. t1�� t2�� ���ÿ� �۵����� �ʰ�.
				
			
				if(getBank()>=moneyNeed) {//�Ʒ� ������ t1 t2�� ���ÿ� �۵��ϱ� ������ �ι��������� -2000�� ��.
					
					money = drawMoney(moneyNeed);
					msg = "���� ����!";
							
				}else {
					money = 0;
					msg = "���� ����!";//*����ȭ��
				}
			}
			System.out.println(Thread.currentThread().getName() + msg + ",����ݾ�: " + money + ",�ܰ�: " + getBank()); 
			
		} catch (Exception e) {
			
		}
	}
}

public class Test8 {

	public static void main(String[] args) {
		
		MyThread8 ob = new MyThread8();
		
		Thread t1 = new Thread(ob);//t1�� t2�� ���� ��ü�� ���°�.
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
		
		

	}

}
