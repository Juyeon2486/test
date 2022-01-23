package com.day9;

//String 
//String은 Class이다.(자료형이 아님)
//저장할 데이터는 방대하고 사용빈도는 높기때문에
//클래스를 자료형처럼 사용함.
//String은 불변의 법칙을 가지고 있기에 23열이 false가 나온다.

//String데이터는 equals로 비교해야 한다. String은 == 로 비교하면안됌.
public class Test3 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		//Call by reference 
		System.out.println("ob1==ob2:" + (ob1==ob2));//true
		System.out.println("ob1==ob3:" + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3):" + ob1.equals(ob3));//true
		//new를 통해 복사하기때문에 ob1과 ob3는 true가아닌 false가 나옴
		ob2 = "korea";//기존데이터와 새로운데이터가 다르면 새로운 공간을 만든다.
		System.out.println("ob1==ob2:" + (ob1==ob2));//false
		
		ob2 = "usa";// 
		System.out.println("ob1==ob2:" + (ob1==ob2));//false
		
		ob2 = "Seoul";// 
		System.out.println("ob1==ob2:" + (ob1==ob2));//true
		
		System.out.println(ob2);//hashcode(x)
		System.out.println(ob2.toString());
		
		
		
		
		
	}

}
