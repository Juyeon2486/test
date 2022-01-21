package com.day1;

public class Test2 {

	public static void main(String[] args) {
		  //자료형 8개 + String(자료형은 아니지만 자료형처럼 사용)
		  //변수선언
		  //자료형 int : 정수(약 -21억 ~ 21억)
          int a=10;
          int b=5;
          
          int c,d;//쓰레기 값이 들어있음
          
          System.out.println(a);//10
          System.out.println(b);//5
          //System.out.println(c);//컴파일 오류
		
          c = a + b;
		  System.out.println(c);//15
		
		  d = a - b;
		  System.out.println(d);//5
		  
		  System.out.println(a + "+" + b + "=" + c);
		  System.out.println();
		  System.out.println(a + "-" + b + "=" + d);
		  
		  //format(모양)
	      System.out.printf("%d+%d=%d\n",a,b,c);
	      System.out.printf("%d - %d = %d%n",a,b,d);
		
	}
}
