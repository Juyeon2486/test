package com.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		Iterator<String> it = lists.iterator();//어레이리스트는 이터레이터로 받음.
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		//ListIterator //일반적인 데이터를 꺼낼 수 있고 역으로 꺼낼 수 있다.
		ListIterator<String> it1 = lists.listIterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println("\n-------------");
		
		while(it1.hasPrevious()) { //hasPrevious를 통해 순서를 역순으로도 넣을 수 있다.
			System.out.print(it1.previous() + " ");
		}
		System.out.println();
		
		List<String> lists1 = new ArrayList<>();
		lists1.addAll(lists);//addAll을 이용하여 컬렉션을 가져올 수 있다.
		lists1.add("인천"); //lists1에 인천을 추가(add)한다.
		
		int n = lists1.indexOf("부산");//부산의 인덱스 +1 한값에 광주를 넣어라.
		lists1.add(n+1,"광주");
		
		for(String s : lists1) { //String s로 lists1을 출력하라.
			System.out.print(s + " ");
		}
		System.out.println("\n---------------");
		
		Iterator<String> it2 = lists1.iterator();
		while(it2.hasNext()) {
			String str = it2.next();
			if(str.startsWith("인")) {//String의 메소드 안에 들어있는단어가 시작이면 출력.  
				System.out.println(str);//startWith가 String의 메소드 첫글자를 찾아내라.
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
