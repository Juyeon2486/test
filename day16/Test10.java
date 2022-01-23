package com.day16;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("e:\\doc\\out4.txt");
			
			PrintStream ps = new PrintStream(fos); //fos에 보다많은 기능을 부여하기위해 한번 감싸주는것.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("문자열?");//프린트 스트림을 읽을땐 버퍼드 리더를 써야함.
			
			String str;
			
			while((str=br.readLine())!=null) {
				ps.println(str);
			}
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			
		}
		
		
		
	}

}
