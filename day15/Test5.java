package com.day15;

class MyThread5 implements Runnable{//임플리먼트 러너블로 만들면

	@Override
	public void run() {//런을 오버라이드 해서 조건을 주고 아래 메인절에서 실행한다.
		
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

		System.out.println("main 시작 ...");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5()); 
		
		//DemonThread : 다른 스레드에 도움을 주는 스레드로
		//다른 스레드가 종료되면 데몬스레드가 종료되지 않더라도
		//프로세스가 종료된다.
		//DemonThread와 join 자주쓰는 스레드와 자주쓰는 옵션이다.
		t1.setDaemon(true);//데몬스레드로 스레드를 만들게되면 메인스레드가 
		t2.setDaemon(true);//종료되면 다른 스레드들도 종료된다.
		t3.setDaemon(true);//데몬스레드의 기본값은 flase이므로 true값을 넣어줌.
		
		
		t1.start();//데몬스레드로 만들지 않으면 메인스레드가 종료되어도
		t2.start();//나머지 스레드들이 끝날때 까지 작동된다.
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {//main에게 1000(1초)초 쉬어라 라는 트라이캐치문.
			
		}
		
		try {//DemonThread의 옵션.
			t1.join();//메인에게 t1,t2,t3이 끝날때 까지 기다리라는 명령어
			t2.join();//꼭 다써줄필요없음 필요한것만. 위 sleep 명령어가 무의미해진다.
			t3.join();//꼭 트라이 캐치문 안에 써주어야함.
		} catch (Exception e) {
			
		}
		
		System.out.println("main 종료 ...");
		
	}

}
