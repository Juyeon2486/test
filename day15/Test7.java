package com.day15;

//인터럽트 : 우선순위가 높은 프로그램을 먼저 실행 시키고 돌아옴. 우선순위는 사용자가 정해준다.

class MyThread7 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++) {
			
			try {
				sleep(2000); //2초 쉬어라
			} catch (Exception e) {
				
			}
			
			System.out.println(getName() + ":" + i);
			
			if(next.isAlive()) {//만약 현재스레드가 살아있으면 끝내고
				next.interrupt();// 다음 스레드를 깨움.
			}
		}
	}
}

public class Test7 {

	public static void main(String[] args) {
		
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
	
		t1.setNext(t2); //우선 순위를 정한것 t1을 실행하다 멈추고 t2, t2실행하다 멈추고 t3, t3실행하다멈추고 t1
		t2.setNext(t3);
		t3.setNext(t1);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt(); //순서대로 실행되게끔 순서를 정해줄 수 있다. 여기까지 쓸일은없고 알아만두기. 인터럽트.
		
		try {
			
			t1.join();
			t2.join();//main 메소드한테 t1 , t2, t3 가 끝날때 까지 기다려라는 명령어.
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
