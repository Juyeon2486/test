package com.day16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args) {//집에서 해보기
	
		try {
			FileInputStream fis = new FileInputStream("e:\\doc\\test.txt");//fis= 파일의 내용을 읽어서 2바이트, fis에 넣는다
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis)); //버퍼드리더에 넣어줄수있다.
			//버퍼드리더는 저장공간생성
			String str;
			
			while((str=br.readLine())!=null) {//문자니깐 널을 써준다 
				System.out.println(str);
			}
			
			fis.close();
			
		} catch (Exception e) {
			
		}
		
	}

}
