package com.day13;

import java.util.Hashtable;
import java.util.Iterator;

//Map(Interface) - HashTable(Class),HashMap(Class)
//HashTable : Vector와 동일 , 동기화를 지원하지만 속도는 느릴 수 있다.
//HashMap : ArrayList와 동일, 동기화를 지원하지 않지만 속도는 빠르다.

//Map<key,value> Generic이 두개.
//key는 중복값을 가질 수 없다.(key:Set //키값에는 셋이라는 자료형 .
//key가 중복되면 마지막 값이 저장된다.(수정)
//Map은 Iterator가 없다. 
//put(key,값) : 추가
//it.next() : key를 읽음
//get(key) : 데이터읽기 


public class Test2 {
	//key
	public static final String[] tel = {
			"111-111","222-222","333-333","111-111","444-444"
	};
	
	//value
	public static final String[] name = {
			"배수지","유인나","정인선","안젤리나","정인아"
	};
	
	
	
	public static void main(String[] args) {
	    //클래스이기에 new로 객체 생성이 된다.
		Hashtable<String, String> h = new Hashtable<>();//키와 벨류의 자료형을 적어준다.
		
		for(int i=0;i<tel.length;i++) { //name과 tel의 데이터값이 5로 같기에 name이나 tel의 length를 써줌
			h.put(tel[i], name[i]);
		}
		
		System.out.println(h); 
		
		String str;
		//key를 주면 value를 가져온다.
		str = h.get("111-111");
		if(str==null||str.equals("")) { //String은 equals로 비교하지만 비교값이 null일땐 ==로 쓴다.
			System.out.println("자료없음!");
		}else {
			System.out.println(str);
		}
		//key가 존재하는지 검사하는것. containsKey
		if(h.containsKey("222-222")) {
			System.out.println("222-222가 존재");
		}
		//데이터값이 존재하는지 검사 containsValue
		if(h.containsValue("유인나")){
				System.out.println("유인나 존재");
	}
		
		//삭제 //Map은 무조건 키
		h.remove("222-222"); //key로 삭제.
		if(h.containsKey("222-222")) {//삭제후 존재하나 안하나 확인해보는 if문.
			System.out.println("222-222가 존재");
		}else {
			System.out.println("222-222가 존재하지 않음");
		}
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();; //key만 읽음.
			String value = h.get(key);	//value를 읽음. key를 읽어 get에 넣고 value를 읽어옴,
					
			System.out.println(key + ":" + value);		
						
		}
		
		
}

}