package com.day1;

public class Test3 {

	public static void main(String[] args) {

		int r=10; // int=����
		float area,length; //float=�Ǽ�
		//float b;
		
		area = r*r*3.14f;
		length = r*2*3.14f;
	    
		System.out.println(area);
	    System.out.println(length);
		
		System.out.println("������: " + r + ", ����: "+ area);
		
		System.out.printf("������: %d, ����: %.1f\n",r,area);
	 
		//---------------------
		
		int a = 5;
		float b;
		
		b=a;
		System.out.println(b);
		
		//a=b;
		
	}

}
