package com.day12;

import java.util.Calendar;

//4.내부클래스(익명의,무명의,Anonymous클래스) //자주 사용

public class Test4 {

	public Object getTitle() {
		
		return new Object() { //오브젝트나 인터페이스 일반적으로 인터페이스를 많이 사용한다.
			
			@Override
			public String toString() {
				return "익명의 클래스"; 
			}
		};
	}
	
	public static void main(String[] args) {

		Test4 ob = new Test4();
		
		Object str = ob.getTitle();
		
		System.out.println(str);
		
	
		
	}

}
