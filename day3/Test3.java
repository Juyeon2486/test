package com.day3;

public class Test3 {

	public static void main(String[] args) {

		int n,sum;
		

		//100������ ��
		sum=0;
		for(n=1;n<=100;n++) {
			sum+=n;
		}
		System.out.println("100������ �� ���:" + sum);
	
		//Ȧ���� ��
		sum=0;
	    for(n=1;n<=100;n+=2) {
	    	sum+=n;
	    }
	    System.out.println("Ȧ���� �� ���:" + sum);
	    
	    //¦���� ��
	    sum=0;
	    for(n=0;n<=100;n+=2) {
	    	sum+=n;
	    }
		
		System.out.println("¦���� �� ���:" + sum);
		
		//3�� ����� ��
		sum=0;
	    for(n=0;n<=100;n+=3) {
	    	sum+=n;
	    }
		//n++�� �����°��� �ƴ� n+=���� ����� �� ����� �� �� �ִ�.
		System.out.println("3�� ����� �� ���:" + sum);
		
		
	}

}
