package com.day16;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamWriter

public class Test4 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.print("문자열?");
		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data = rd.read())!=-1) {//사용자에게 받은값을 rd.read로 받아서 -1과 같지않으면
			
			wr.write(data); //용량에 가득차야 출력이 됨. 아래 플러쉬로 강제로 출력
			wr.flush(); //데이터를 강제로 내보내는것 flush / writer는 강제로 써야함.
		}
	}

}
