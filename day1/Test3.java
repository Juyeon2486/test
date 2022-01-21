package com.day1;

public class Test3 {

	public static void main(String[] args) {

		int r=10; // int=정수
		float area,length; //float=실수
		//float b;
		
		area = r*r*3.14f;
		length = r*2*3.14f;
	    
		System.out.println(area);
	    System.out.println(length);
		
		System.out.println("반지름: " + r + ", 면적: "+ area);
		
		System.out.printf("반지름: %d, 면적: %.1f\n",r,area);
	 
		//---------------------
		
		int a = 5;
		float b;
		
		b=a;
		System.out.println(b);
		
		//a=b;
		
	}

}
