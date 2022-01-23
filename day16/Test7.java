package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//파일 복사
		//원본 파일? e:\\doc\\test.txt
		//대상 파일? e:\\doc\\out2.txt
		//복사완료
 		
		Scanner sc = new Scanner(System.in);
		
		String str1,str2;
		int data;
	
			try {
			
				System.out.print("원본파일?"); //원본파일의 경로
				str1 = sc.next();
				
				System.out.print("대상파일?"); //대상파일의 경로
				str2 = sc.next();
				
				FileInputStream fis = new FileInputStream(str1);
				FileOutputStream fos = new FileOutputStream(str2);
		
				
				while((data=fis.read())!=-1) { //사용자에게 받은 1바이트의 문자를 데이터로 읽어서 포스로 내보낸다.
					
				    fos.write(data);
					fos.flush();
				}
				
				fis.close();
				fos.close();
				System.out.println("복사완료");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
