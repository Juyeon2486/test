package com.day12;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String[] city = {
			"서울","부산","대구","인천","광주","대전","울산"
	};


	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); //< > 사이의 값을 앞에만 입력해주면 뒤에선 생략해도 괜찮다.

		for(String s : city) {
			v.add(s);

		}
		//v.add(10); 위에서 String만 넣는다고 선언했기에 Integer 값은 넣을 수 없다.

		String str;

		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		//for
		for (int i=0;i<v.size();i++) {//i가 0일때 i는 벡터의 사이즈보다 작을때까지 i++
			System.out.print(v.get(i) + " ");
			
		}
		System.out.println();
		//확장 for
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Iterator(반복자) 이터레이터
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) { //변수 it에 데이터가 있을때까지 반복하라는뜻 =hasNext
		
			str = it.next();//read 하이라이트바가 있는곳에 데이터를 읽어라.
			System.out.print(str + " ");
			
			
			
			
		}
		
		
		
		
		
	}
}
