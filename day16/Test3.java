package com.day16;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte Stream을 2btye Stream으로 변환해주는 Stream 이다.
//브릿지 스트림. //독자적으로 사용할수 없기에

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data; // int data로 변수선언
		System.out.println("문자열?"); //문자열? 출력
		
		Reader rd = new InputStreamReader(System.in);//Reader는 저장소? 같은 개념 
		//InputStreamReader(System.in)을 new로 객체생성하여 사용하기 때문에 메인절에 IOException 예외처리를 해준다.
		
		while((data = rd.read())!=-1) {//rd.read로 받은 값이 -1과 같지않으면 (!=-1) data 값에 들어감
			
			char ch = (char)data; //char ch 캐릭터로 ch 변수 선언 data 변수를 출력하기위해 (char)로 변환
			System.out.print(ch); //ch 출력
		}
	}

}
