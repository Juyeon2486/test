package com.day1;

public class Test2 {

	public static void main(String[] args) {
		  //�ڷ��� 8�� + String(�ڷ����� �ƴ����� �ڷ���ó�� ���)
		  //��������
		  //�ڷ��� int : ����(�� -21�� ~ 21��)
          int a=10;
          int b=5;
          
          int c,d;//������ ���� �������
          
          System.out.println(a);//10
          System.out.println(b);//5
          //System.out.println(c);//������ ����
		
          c = a + b;
		  System.out.println(c);//15
		
		  d = a - b;
		  System.out.println(d);//5
		  
		  System.out.println(a + "+" + b + "=" + c);
		  System.out.println();
		  System.out.println(a + "-" + b + "=" + d);
		  
		  //format(���)
	      System.out.printf("%d+%d=%d\n",a,b,c);
	      System.out.printf("%d - %d = %d%n",a,b,d);
		
	}
}
