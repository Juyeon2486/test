package com.day16;

import java.io.FileOutputStream;

//FileOutputStream

public class Test6 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("e:\\doc\\out1.txt");
			
			int data;
			System.out.print("문자열:"); //abcd
			
			while((data=System.in.read())!=-1) { //사용자에게 받은 1바이트의 문자를 데이터로 읽어서 포스로 내보낸다.
				
				fos.write(data); //아스키값이 입력됨.
				fos.flush();
			}
			
			fos.close(); //
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
