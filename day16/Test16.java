package com.day16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test16 {

	public static void main(String[] args) throws Exception {

		//역 직렬화
		
		FileInputStream fis = new FileInputStream("e:\\doc\\out6.txt");//★ 넣을때는 오브젝트로 업캐스팅 되므로 기존값이 해쉬테이블이니깐 다운캐스팅해준다.
		ObjectInputStream ois = new ObjectInputStream(fis);
		 //다운캐스팅해서 스트링으로 받아준다.
		Hashtable<String, String> h = (Hashtable<String, String>)ois.readObject();
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + ":" + value);
			
		}
		
		ois.close();
		fis.close();
	}
	
	

}
