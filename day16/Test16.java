package com.day16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test16 {

	public static void main(String[] args) throws Exception {

		//�� ����ȭ
		
		FileInputStream fis = new FileInputStream("e:\\doc\\out6.txt");//�� �������� ������Ʈ�� ��ĳ���� �ǹǷ� �������� �ؽ����̺��̴ϱ� �ٿ�ĳ�������ش�.
		ObjectInputStream ois = new ObjectInputStream(fis);
		 //�ٿ�ĳ�����ؼ� ��Ʈ������ �޾��ش�.
		Hashtable<String, String> h = (Hashtable<String, String>)ois.readObject();
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + ":" + value);
			
		}
		
		ois.close();
		fis.close();
	}
	
	

}
