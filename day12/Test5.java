package com.day12;

import java.util.Vector;

//Collection Framework(방법론)

//배열의 단점
//1.크기를 정하면 변경이 불가능
//2.미리 크게 잡으면 메모리 낭비가 될 수 있음
//3.배열사이에 삽입이 불가능하다.

//List,Vector,Set,Map,Hashtable,TreeSet,HashSet

//List(I) - ArrayList(Class),Vector(Class) 어레이리스트 동기화 허용x 빠름 / 벡터 동기화 허용o 느림

//Map(I) - Hashtable(class),HashSet(Class)
public class Test5 {
  
	
	public static void main(String[] args) {
//Vector<E>에서 E는 제너릭 :유형을 어떤걸로 할거냐 묻는것.
		Vector v = new Vector<>(); //기본 데이터 type이 Object이다. 
		//자료형 상관없이 선언가능하지만,출력시 다운캐스트해야한다.
		
		v.add("서울"); //upcast
		v.add(30);
		v.add('c');
		
		String s = (String) v.get(0); //downcast
		System.out.println(s);
		
		Integer i = (Integer) v.get(1);
		System.out.println(i);
		
		char c = (char) v.get(2);
				
		
		
		
		
	}

}
