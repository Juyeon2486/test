package com.day16;

import java.io.File;
import java.io.FileOutputStream;

public class Test13 {

	public static void main(String[] args) {

		String str = "e:\\doc\\temp\\java1\\itwill.txt";
		
	/*	//���1
		String path = str.substring(0,str.lastIndexOf("\\"));
		//path = d:\\doc\\temp\\java1�̴�   ��Ʈ�ε������� \\ -1
		//System.out.println(path);
		
		File f = new File(path);
		if(!f.exists()) {
			f.mkdirs(); //��η� ���� �����. ������.
		}*/
		
		
		//���2
		File f = new File(str);
		if(!f.getParentFile().exists()) {//"e:\\doc\\temp\\java1�� ���� itwill.txt�� ���ٸ�
			f.getParentFile().mkdirs();// ��η� ���� ������ ��¶�.
		}
		//����
		try {

			FileOutputStream fos = new FileOutputStream(str);
			
			System.out.print("���ڿ� �Է�?");
			
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
