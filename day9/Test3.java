package com.day9;

//String 
//String�� Class�̴�.(�ڷ����� �ƴ�)
//������ �����ʹ� ����ϰ� ���󵵴� ���⶧����
//Ŭ������ �ڷ���ó�� �����.
//String�� �Һ��� ��Ģ�� ������ �ֱ⿡ 23���� false�� ���´�.

//String�����ʹ� equals�� ���ؾ� �Ѵ�. String�� == �� ���ϸ�ȉ�.
public class Test3 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		//Call by reference 
		System.out.println("ob1==ob2:" + (ob1==ob2));//true
		System.out.println("ob1==ob3:" + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3):" + ob1.equals(ob3));//true
		//new�� ���� �����ϱ⶧���� ob1�� ob3�� true���ƴ� false�� ����
		ob2 = "korea";//���������Ϳ� ���ο���Ͱ� �ٸ��� ���ο� ������ �����.
		System.out.println("ob1==ob2:" + (ob1==ob2));//false
		
		ob2 = "usa";// 
		System.out.println("ob1==ob2:" + (ob1==ob2));//false
		
		ob2 = "Seoul";// 
		System.out.println("ob1==ob2:" + (ob1==ob2));//true
		
		System.out.println(ob2);//hashcode(x)
		System.out.println(ob2.toString());
		
		
		
		
		
	}

}
