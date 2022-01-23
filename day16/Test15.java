package com.day16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//객체의 직렬화
//메모리에 생성된 클래스 객체의 인스턴스 변수의 현재 상태를
//그대로 파일에 저장 하거나 네트워크를 통해서 전달 할 수 있는 기능.
//오로지 byte 단위로만 데이터를 송수신 할 수 있다.

//장점은 객체의 내용을 입출력 형식에 구애 받지않고 객체를 
//파일에 저장함으로써 영속성을 제공할 수 있고 객체 자체를
//네트워크를 통해서 손쉽게 교환할 수 있다..

//implements Serializable
//메소드가 없다.

public class Test15 {

	public static void main(String[] args) throws Exception {
		
		Hashtable<String, String> h = new Hashtable<>();//해쉬테이블에 시리얼라이저블이 있기에 오류가안남
		
		h.put("1", "배수지");
		h.put("2", "유인나");
		h.put("3", "정인선");
		
		FileOutputStream fos = new FileOutputStream("e:\\doc\\out6.txt");//fos를 감싼게 oos 직렬화된 데이터를
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(h);
		oos.close();
		fos.close(); //쓰고 항상 닫아주자
		
		System.out.println("직렬화 데이터 저장 성공");

	}

}
