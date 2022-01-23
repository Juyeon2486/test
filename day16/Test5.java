package com.day16;

import java.io.FileInputStream;

//파일 읽어오기
//FileInputStream.

public class Test5 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("e:\\doc\\test.txt");//파일 복사 5번과6번을 잘합치면.
			
			
			int data;  //리드는 반환값이 인트.
			while((data=fis.read())!=-1) {//3바이트에 한글 입력을 하려할때 '감사'라는 단어를 넣으면 한단어당 2바이트이기때문에 '감'만 적히고 사는 입력이 안됨.
				
				//System.out.print((char)data); //캐릭터로 읽으면 깨져서 나오기때문에 주석
				//
				System.out.write(data); //줄 쓰고 엔터까지 표시, 줄쓰고 엔터까지 표시 하기때문에 아래 플러쉬가없으면
				//우리나라 만세가 출력되지않음.
				System.out.flush(); // 그러므로 플러쉬로 전부다 출력되게한다.
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
