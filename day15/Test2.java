package com.day15;

class MyThread2 implements Runnable{

	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name; 
		
	}
	@Override
	public void run() {
		 
		int i = 0;
		
		while (i<num) {
			System.out.println(name + ":" + i);//인터페이스에는 getName이 없다.
			i++;
			
			try {//Thread를 상속 받았을땐 트라이캐치문에 슬립만 써주고 인터페이스를 상속받았을땐 Thread.sleep을 써야함.
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test2 {

	public static void main(String[] args) {//여러작업을 번갈아 작업하게 하는걸 Thread라고 한다.
		
		System.out.println("main 시작 ...");
		
		Thread t1 = new Thread(new MyThread2(100, "첫번째...")); //러너블로 스레드를 만들어쓸때 객체 생성을 해주는 공식.
		Thread t2 = new Thread(new MyThread2(200, "두번째..."));

		t1.start();//Thread를 실행하기위해 스타트를 써주어야함
		t2.start();
		
		System.out.println("main 종료 ...");
	}

}
