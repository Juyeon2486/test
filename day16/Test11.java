package com.day16;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos;
			PrintStream ps;
			
			fos = new FileOutputStream("e:\\doc\\out4.txt");
			ps = new PrintStream(fos);
			//print 안됌 println이 있어야 입력됨. 엔터가 있어야함.
			ps.println("이순신");
			ps.println("홍길동");
			ps.println("허준");
			
			ps.close();
			fos.close();
			
			fos = new FileOutputStream("e:\\doc\\out4.txt",true);//파일아웃풋스트림과 프린트스트림. 같이 짝지어있지않으면 트루가 의미가없다
			ps = new PrintStream(fos); //같이 짝지어 쓰지않으면 트루가 의미가없다.
			ps.println("배수지");
			ps.println("유인나");
			ps.println("젬마샘");
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
