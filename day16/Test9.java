package com.day16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args) {//������ �غ���
	
		try {
			FileInputStream fis = new FileInputStream("e:\\doc\\test.txt");//fis= ������ ������ �о 2����Ʈ, fis�� �ִ´�
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis)); //���۵帮���� �־��ټ��ִ�.
			//���۵帮���� �����������
			String str;
			
			while((str=br.readLine())!=null) {//���ڴϱ� ���� ���ش� 
				System.out.println(str);
			}
			
			fis.close();
			
		} catch (Exception e) {
			
		}
		
	}

}
