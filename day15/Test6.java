package com.day15;

//스레드 TTL(Time To Live)

class MyThread6 extends Thread{
	
	@Override
	public void run() { 
		
		try {
			System.out.println("스레드 시작 ... ");
			
			System.out.println("우선순위: " + getPriority());
			System.out.println("스레드이름: " + getName());//스레드의 getName.
			
			//0.5초 쉬어라
			sleep(500); // sleep은 반드시 트라이 안에 묶어주어야한다 안그러면 에러.
			
			//우선순위 변경
			setPriority(2);
			System.out.println("변경된 우선 순위: " + getPriority());
			
			System.out.println("스레드 종료 ... ");
			
		} catch (Exception e) {
			
		}
	}
}
public class Test6 {
 
	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread(); //현재 Thread를 t1에 넣어라 현재 Thread는 main.
		Thread t2 = new MyThread6();
															//기본우선순위호출
		System.out.println("메인 스레드 우선 순위: " + t1.getPriority());//5 //모든 스레드의 우선순위는 5 이다.
		System.out.println("현재 스레드의 이름: " + t1.getName());//main
		System.out.println("t2스레드의 이름: " + t2.getName());//Thread-0
		
		System.out.println("t2.start() 메소드 호출전의 isAlive:" + t2.isAlive());//t2가 살아있냐 라는뜻. flase가 나옴 t2.strat가 없기때문
		
		t2.start();
		
		//t2우선순위
		System.out.println("t2 우선순위: " + t2.getPriority());
		
		//t2의 우선순위 변경
		t2.setPriority(1);//우선순위를 5에서 1로 바꿈
		
		try {
			
			//0.1초 쉬게끔 만듬.
			Thread.sleep(100); //슬립안 값의 x10 한 초
			
			//t2 종료확인
			System.out.println("t2 살아있냐? " + t2.isAlive());
			
			//1초 쉬게만듬
			Thread.sleep(1000);//쉬고 있는동안 다른 작업. 그러므로 위아래로 이동하며 작업.
								//슬립을 통해서 순서를 바꿔줌.
			System.out.println("1초 sleep후 t2 살아있냐? " + t2.isAlive());
			
			t2.join();
			
			System.out.println("그래도 살아있냐? " + t2.isAlive());
			
			
		} catch (Exception e) {
			
		}
		
		
		
	}

}
