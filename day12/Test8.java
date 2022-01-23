package com.day12;

import java.util.Vector;

class Test{
	
	String name;
	int age;
	
}



public class Test8 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>();
		
		Test ob; 
		ob = new Test();//새로운 객체를 생성하지않으면 동일 주소값에 있는 데이터가 변경되버림.
		ob.name = "배수지";
		ob.age = 27;
		v.add(ob);
		
		ob = new Test();//여러 데이터를 만들거라면 반드시 객체 생성을 여러번 해야함.
		ob.name = "유인나";
		ob.age = 41;
		v.add(ob);
		
		for(Test t : v) {
			System.out.println(t.name + ":"	+ t.age);
		}
		
		
	}

}
