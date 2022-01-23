package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("e:\\doc\\data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new MyDataVO("suzi", 30));
		oos.writeObject(new MyDataVO("inna", 40));
		oos.writeObject(new MyDataVO("insun", 27));
		oos.writeObject(new MyDataVO("jihae", 30));
		oos.writeObject(new MyDataVO("gemma", 32));
		
		oos.close();
		fos.close(); //����ȭ ��
		
		//������ȭ
		FileInputStream fis = new FileInputStream("e:\\doc\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyDataVO ob = null;
		
		try {
			
			while(true) {//����Ʈ�� �Ƚ�⿡ �ϳ��ϳ� Ȯ���ؾ��ϹǷ� ���Ϲ�
						 //����Ʈ�� ��ٸ� ���ͷ����� ���.
				
				ob = (MyDataVO)ois.readObject();
				
				if(ob==null) { //ob���� ���̸� ����������.
					break;
				}
				
				System.out.println(ob.toString());
			}
			
		} catch (Exception e) {
			
		}
		
		ois.close();
		fis.close();
	}

}
