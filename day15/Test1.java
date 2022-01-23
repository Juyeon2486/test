package com.day15;

class MyThread1 extends Thread{//java.lang의 Thread를 상속받아 MyThread1 = Thread가 된다
	
	private int num;
	private String name;
	
	public MyThread1(int num, String name) {//생성자로 초기화 , 메소드에 초기화해도됨.
		this.num = num;
		this.name = name;
	} 
 
	@Override
	public void run() {//여기도 작업// 스레드는 반드시 런이라는 메소드를 오버라이드 해야함.
		
		//Thread method(자바의 VM이 호출)
		
		int i = 0;
		
		while(i<num) {//사용자에게 입력받은 num이 100이면  0~99까지 100번 돌려라 라는뜻
			
			System.out.println(this.getName()+ ":" + name + i);
			i++;
			
			try {
				sleep(100);//t1 t2가 다른 메모리에 올라감으로 t1이 찍고 0.1초 쉴때 t2가 작동 반대로 t2가 0.1초 쉴때 0.1이 작동 멀티태스킹
				
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test1 {

	public static void main(String[] args) {//여기도 작업 만들어서 번갈아 작업하게 만듬.

		System.out.println("main 시작...");
		
		MyThread1 t1 = new MyThread1(100, "첫번째: ");
		MyThread1 t2 = new MyThread1(200, "두번째: ");
		
		t1.start();//t1과 t2가 run으로 올라감. 그후 main 종료가 출력 되고 
		t2.start();
		
		
		
		System.out.println("main 종료...");
		
		
	}

}
