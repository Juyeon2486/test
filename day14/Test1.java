package com.day14;

class Box<T>{
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();
		b1.set(10);  //auto-Boxing //스택영역이 힙 영역으로
		//Integer와 int는 똑같다. int는 스택영역 integer는 힙영역 메소드
		int i = b1.get();//auto-unBoxing 힙영역이 스택영역으로
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		//b2.set(10); 자료형을 String으로 만들었기 때문에 오류
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box<>(); //자료형을 아무것도 주지않으면 오브젝트.
		b3.set(30);
		Integer ii = (Integer)b3.get();//자료형을 아무것도 주지않아 오브젝트로 만들어졌기에
		//다운 캐스팅을 하여 인티저 값을 받아온다
		System.out.println(ii);
				
		
		
	}

}
