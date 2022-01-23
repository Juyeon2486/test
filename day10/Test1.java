package com.day10;

//Wrapper Ŭ����
//�⺻ �ڷ����� Ŭ������ ����� �� �ְ� ���ش�.
//�ڷ���
//boolean,byte,char,short,int,long,float,double
//Wrapper Ŭ������ ������
//Boolean,Byte,Character,Short,Integer,Long,Float,Double

//Auto-Boxing(�ڷ���->wrapperŬ������ ��ȯ, stack->heap)
//Auto-unBoxing(wrapperŬ����->�ڷ������� ��ȯ, heap->stack)

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
		System.out.println(Integer.toString(a));//��Ƽ���� ����Ʈ���� ����ϸ� ���ڷ�ǥ��ȴ�
		//������ �ȵ� �����̱⶧����
		System.out.println(Integer.toString(a,2));//11000 (24�� 2����)
		System.out.println(Integer.toString(a,16));//18 (24�� 16����)
		
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

f=i; o �Ͻ��� ����ȯ.
i=f; x int=10 float 10.0 �÷��� �Ҽ�����ǥ���ϱ⶧���� �����ʴ´�.
i=(int)f; o ����� ����ȯ.

-------------------------------
�θ�(float)-�ڽ�(int)������ ���

�θ� (f) = �ڽ� (i);         o UPCAST(CAST�� ����ȯ�̶�¶�)
�θ� ū�����̱� ������ �ڽ��� �θ𿡰� �� �� �ִ�.

�ڽ� (i) = �θ� (f);         x 
�ڽ� (i) = (�ڽ�i)�θ� (f);  o DOWNCAST 

*/