package com.day16;

import java.io.IOException;

//Stream
//데이터 입출력시 모든 데이터를 형태와 관계없이 일련된 흐름으로 전송하는것.
//데이터가 이동하는 파이프 라인이라고 생각.
//in이 가장 기본 Stream이다.
public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;
		//while문은 조건식이 true 일 경우에 계속해서 반복한다.
		System.out.print("문자 입력:");//시스템인리드 문자를 1바이트로 받아온다
		while((data = System.in.read())!=-1) {//시스템 인 리드로 받은 값이 -1과 같지 않은게 true이면 data로 들어감
			char ch = (char)data; //캐릭터 ch는 (char)data; 캐릭터를 출력하기 위해 char을 적어줌
			System.out.print(ch);//ch를 출력해라
		}
			
		
		
	}	

}
