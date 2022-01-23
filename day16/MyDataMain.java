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
		fos.close(); //직렬화 끝
		
		//역직렬화
		FileInputStream fis = new FileInputStream("e:\\doc\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyDataVO ob = null;
		
		try {
			
			while(true) {//리스트를 안썼기에 하나하나 확인해야하므로 와일문
						 //리스트를 썼다면 이터레이터 사용.
				
				ob = (MyDataVO)ois.readObject();
				
				if(ob==null) { //ob값이 널이면 빠져나가라.
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
