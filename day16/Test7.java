package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//���� ����
		//���� ����? e:\\doc\\test.txt
		//��� ����? e:\\doc\\out2.txt
		//����Ϸ�
 		
		Scanner sc = new Scanner(System.in);
		
		String str1,str2;
		int data;
	
			try {
			
				System.out.print("��������?"); //���������� ���
				str1 = sc.next();
				
				System.out.print("�������?"); //��������� ���
				str2 = sc.next();
				
				FileInputStream fis = new FileInputStream(str1);
				FileOutputStream fos = new FileOutputStream(str2);
		
				
				while((data=fis.read())!=-1) { //����ڿ��� ���� 1����Ʈ�� ���ڸ� �����ͷ� �о ������ ��������.
					
				    fos.write(data);
					fos.flush();
				}
				
				fis.close();
				fos.close();
				System.out.println("����Ϸ�");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
