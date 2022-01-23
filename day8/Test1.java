package com.day8;

//Call by Value //�� ���� ����
//stack �������� Heap�������� �����Ͱ� �Ѿ. 
//Call by Reference //�� ���� ���۷���
//���� �ѱ涧 ��ü�� ������ �ּҰ� �Ѿ.  


class Test{
	
	public int x = 10;
	//�⺻�����ڰ� �ִ°� (�����������¾ʴ´�.)
	public void sub(int a) {
		x += a;
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Test ob = new Test();
		
		//Call By Value
		int a = 20 ;
		
		System.out.println("sub()�޼ҵ� ������ x:" + ob.x);
		ob.sub(a);
		System.out.println("sub()�޼ҵ� ������ x:" + ob.x);
		
		//Call By Reference
		
		Test ob1;
		ob1 = ob;
		
		System.out.println(ob.x);//30
		System.out.println(ob1.x);//30
		
		ob1.x = 100;
		System.out.println(ob.x);//100
		System.out.println(ob1.x);//100
//Reference �����ϴ�.
	
	}

}