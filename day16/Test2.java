package com.day16;

import java.io.IOException;
import java.io.OutputStream;

public class Test2 {

	public static void main(String[] args) throws IOException{

		OutputStream os = System.out;
		
		byte[] b = new byte[3];//buffer 
		
		b[0] = 65; //"A"
		b[1] = 97; //"a"
		b[2] = 122; //"z"
		
		os.write(b); //os�� b�� ����ض� = Aaz 
		
		System.out.println("�� ���̳�1?"); //Aaz������ϰ� �� ���̳�1?�� ��µ� =Aaz�� ���̳�?
		
		os.close();
		
		System.out.println("�� ���̳�2?");//�� 22���ٿ��� os�� close�� ���� ���ױ⿡ �� ���̳�2?�� �����������.
	}

}
