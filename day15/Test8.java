package com.day15;

class MyThread8 implements Runnable{
	
	private int bank = 10000;
	
	private int getBank() {
		return bank;
		
	}
	
	private int drawMoney(int m) {
		bank-=m; //bank-=  = bank-m; //인출
 		return m; //인출 금액
	}

	@Override
	public void run() {
		
		int moneyNeed = 6000; //인출할 금액
		int money;
		String msg = "";
		
		try {
			//금액이 크거나 같으면 뺀다.
			synchronized (this) {//*동기화블럭. 순서를 맞춰준다. t1과 t2가 동시에 작동하지 않게.
				
			
				if(getBank()>=moneyNeed) {//아래 메인절 t1 t2가 동시에 작동하기 때문에 두번빠져나가 -2000이 뜸.
					
					money = drawMoney(moneyNeed);
					msg = "인출 성공!";
							
				}else {
					money = 0;
					msg = "인출 실패!";//*동기화블럭
				}
			}
			System.out.println(Thread.currentThread().getName() + msg + ",인출금액: " + money + ",잔고: " + getBank()); 
			
		} catch (Exception e) {
			
		}
	}
}

public class Test8 {

	public static void main(String[] args) {
		
		MyThread8 ob = new MyThread8();
		
		Thread t1 = new Thread(ob);//t1과 t2는 같은 객체를 쓰는것.
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
		
		

	}

}
