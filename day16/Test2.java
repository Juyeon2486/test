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
		
		os.write(b); //os의 b를 출력해라 = Aaz 
		
		System.out.println("나 보이냐1?"); //Aaz를출력하고 나 보이냐1?가 출력됨 =Aaz나 보이냐?
		
		os.close();
		
		System.out.println("나 보이냐2?");//위 22번줄에서 os를 close로 종료 시켰기에 나 보이냐2?는 실행되지않음.
	}

}
