package com.day15;

//스레드 우선순위 (정확하지는 않지만 어느정도의 우선순위를 정할 수는 있다.
class MyThread4 extends Thread{

	private String name;
	
	public MyThread4(String name) {
		this.name = name; 
		
	}

	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
		
}
public class Test4 {
 
	public static void main(String[] args) {//main Thread 

		MyThread4 ob1 = new MyThread4("A");//Thread0
		MyThread4 ob2 = new MyThread4("B");//Thread1
		MyThread4 ob3 = new MyThread4("C");//Thread2
		
		System.out.println("main 시작... ");
		//우선순위 종류(1~10)
		System.out.println("Min: " + Thread.MIN_PRIORITY);//1
		System.out.println("Nor: " + Thread.NORM_PRIORITY);//5(기본)값이 5다
		System.out.println("Max: " + Thread.MAX_PRIORITY);//10
		
		//기본 스레드의 우선순위
		System.out.println(ob1.getPriority());//5 가져올땐 get
		System.out.println(ob2.getPriority());//5
		System.out.println(ob3.getPriority());//5
		
		System.out.println("main 종료... ");
		
		//우선순위 변경
		ob1.setPriority(Thread.MIN_PRIORITY);//입력할땐 set
		ob2.setPriority(Thread.NORM_PRIORITY);//숫자로 써도됌.
		ob3.setPriority(Thread.MAX_PRIORITY);
		
		ob1.start();
		ob2.start();
		ob3.start();
		
		
	}

}
