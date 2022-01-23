package com.day10;

//Wrapper 클래스
//기본 자료형을 클래스로 사용할 수 있게 해준다.
//자료형
//boolean,byte,char,short,int,long,float,double
//Wrapper 클래스로 만들어둠
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//Auto-Boxing(자료형->wrapper클래스로 변환, stack->heap)
//Auto-unBoxing(wrapper클래스->자료형으로 변환, heap->stack)

public class Test1 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;
		
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//Auto-Boxing
		n2 = num2;//Auto-unBoxing
		
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);
		
		int a =24;
		System.out.println(a);//24
		System.out.println(Integer.toString(a));//인티저의 투스트링을 사용하면 문자로표기된다
		//연산이 안됨 문자이기때문에
		System.out.println(Integer.toString(a,2));//11000 (24의 2진수)
		System.out.println(Integer.toString(a,16));//18 (24의 16진수)
		
		int x = 10;
		float y;
		
		y = x;
		System.out.println(y);
		
		x = (int)y;
		System.out.println(x);
	}

}

/*
int i = 10;
float f;

f=i; o 암시적 형변환.
i=f; x int=10 float 10.0 플롯은 소수점을표현하기때문에 들어가지않는다.
i=(int)f; o 명시적 형변환.

-------------------------------
부모(float)-자식(int)관계의 상속

부모 (f) = 자식 (i);         o UPCAST(CAST는 형변환이라는뜻)
부모가 큰개념이기 때문에 자식이 부모에게 들어갈 수 있다.

자식 (i) = 부모 (f);         x 
자식 (i) = (자식i)부모 (f);  o DOWNCAST 

*/