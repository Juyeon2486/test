package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {

	public boolean fileCopy(String str1,String str2) {
		
		File f = new File(str1); // 수정은 불가능 지우는건가능 //파일외에서 할수있는건 다가능.
		
		if(!f.exists()) { //존재하다.
			return false;
		}
		
		try {
			
			FileInputStream fis = new FileInputStream(f);//str1//파일을 읽어내고 내보내는것은 인풋스트림과 아웃풋스트림만 가능.
			FileOutputStream fos = new FileOutputStream(str2);//수정 가능 지우는건 불가능
			
			int data = 0;//인트라 1개씩 읽음
			byte[] buffer = new byte[1024];//1024개의 배열//파일을 내보내고 받을때 사용하는 코딩 외우기.
			
			while((data=fis.read(buffer, 0, 1024))!=-1) {//1024개를 읽어와서 버퍼로 내보냄. 저장할공간,시작,길이
				fos.write(buffer, 0, data);//!=-1 은 버퍼에있는 데이터가 없을때 까지 데이터가 -1 아닐때 까지
			}
			
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return true;
	}
	
	private FileOutputStream FileOutputStream(String str2) {
		
		return null;
	}

	public static void main(String[] args) {

		Test8 ob = new Test8();
		
		if(ob.fileCopy("e:\\doc\\test.txt", "e:\\doc\\out3.txt")) {
			System.out.println("파일 복사 성공");
		}else {
			System.out.println("파일 복사 실패");
		}
	}

}
