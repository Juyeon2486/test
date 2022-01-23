package com.day3;

public class Test3 {

	public static void main(String[] args) {

		int n,sum;
		

		//100까지의 합
		sum=0;
		for(n=1;n<=100;n++) {
			sum+=n;
		}
		System.out.println("100까지의 합 결과:" + sum);
	
		//홀수의 합
		sum=0;
	    for(n=1;n<=100;n+=2) {
	    	sum+=n;
	    }
	    System.out.println("홀수의 합 결과:" + sum);
	    
	    //짝수의 합
	    sum=0;
	    for(n=0;n<=100;n+=2) {
	    	sum+=n;
	    }
		
		System.out.println("짝수의 합 결과:" + sum);
		
		//3의 배수의 합
		sum=0;
	    for(n=0;n<=100;n+=3) {
	    	sum+=n;
	    }
		//n++만 나오는것이 아닌 n+=으로 배수의 합 결과를 얻어낼 수 있다.
		System.out.println("3의 배수의 합 결과:" + sum);
		
		
	}

}
