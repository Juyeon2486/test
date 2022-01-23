package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {

	public boolean fileCopy(String str1,String str2) {
		
		File f = new File(str1); // ������ �Ұ��� ����°ǰ��� //���Ͽܿ��� �Ҽ��ִ°� �ٰ���.
		
		if(!f.exists()) { //�����ϴ�.
			return false;
		}
		
		try {
			
			FileInputStream fis = new FileInputStream(f);//str1//������ �о�� �������°��� ��ǲ��Ʈ���� �ƿ�ǲ��Ʈ���� ����.
			FileOutputStream fos = new FileOutputStream(str2);//���� ���� ����°� �Ұ���
			
			int data = 0;//��Ʈ�� 1���� ����
			byte[] buffer = new byte[1024];//1024���� �迭//������ �������� ������ ����ϴ� �ڵ� �ܿ��.
			
			while((data=fis.read(buffer, 0, 1024))!=-1) {//1024���� �о�ͼ� ���۷� ������. �����Ұ���,����,����
				fos.write(buffer, 0, data);//!=-1 �� ���ۿ��ִ� �����Ͱ� ������ ���� �����Ͱ� -1 �ƴҶ� ����
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
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
	}

}
