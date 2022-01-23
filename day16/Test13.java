package com.day16;

import java.io.File;
import java.io.FileOutputStream;

public class Test13 {

	public static void main(String[] args) {

		String str = "e:\\doc\\temp\\java1\\itwill.txt";
		
	/*	//방법1
		String path = str.substring(0,str.lastIndexOf("\\"));
		//path = d:\\doc\\temp\\java1이다   라스트인덱스오브 \\ -1
		//System.out.println(path);
		
		File f = new File(path);
		if(!f.exists()) {
			f.mkdirs(); //경로로 가서 만든다. 없으면.
		}*/
		
		
		//방법2
		File f = new File(str);
		if(!f.getParentFile().exists()) {//"e:\\doc\\temp\\java1로 가서 itwill.txt가 없다면
			f.getParentFile().mkdirs();// 경로로 가서 만들어라 라는뜻.
		}
		//공통
		try {

			FileOutputStream fos = new FileOutputStream(str);
			
			System.out.print("문자열 입력?");
			
			int data;
			while ((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
				
			}
			
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
