package com.day2;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		//자료형 char(캐릭터) 기호만 저장
		
		//String str = "suzi"; //String은 " 큰따옴표 
		//char는 한글자만 가능 //char는 ' 작은따옴표
		//Ascill값+각나라언어 = Unicode 0~65535(숫자아닌 기호)
		char ch,result;
		
		System.out.print("한개의 문자?");//a(97)
		
		ch = (char)System.in.read(); //97
		//System.in.read()를 사용하면 int로 변환해주기때문에 다시 기호로 변환을위해 (char)를 넣어준다
		
		//System.out.println(ch);//a
		//System.out.println(Integer.toString(ch));
		//char ch = 'a'=Unicode97과 같다.
		//97
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch + ":" + result);
		
		
		
		
		
		
	}

}
