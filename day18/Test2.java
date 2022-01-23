package com.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("클래스명[java.lang.String]? ");//패키지의 이름과 클래스의 이름이 들어간다. 아래 포네임으로 
		String str = br.readLine(); 					//클래스와 패키지를 읽어온다.
		
		Class cls = Class.forName(str); //사용자가 입력한 이름을 cls에 넣음. // ★
		
		//String의 생성자 정보.
		System.out.println("생성자 정보...");
		Constructor<?>[] c = cls.getConstructors();//컨스트럽터 cls를 c에 가져온다.
		//몇개인지 모르기에 배열로 만듬 ?는 생략가능
		for(int i = 0; i<c.length;i++) {
			System.out.println(c[i]); //검색한 생성자 정보를 출력해라.
		}
		
		System.out.println("필드 정보..."); //필드는 변수다.
		
		Field[] f = cls.getFields();//java.lang.reflect
		for(int i = 0; i<f.length;i++) {
		System.out.println(f[i]); //		
		}
	
		System.out.println("메소드 정보..."); //필드는 변수다.
		Method[] m = cls.getMethods();//java.lang.reflect
		for(int i = 0; i<m.length;i++) {
		System.out.println(m[i]); //		
	}

    }
}