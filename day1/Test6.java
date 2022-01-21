package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException  {

		//밑변(width)과 높이(height)를 입력받아 삼각형 넓이(area) 구하기
		//밑변? : ??
		//높이? : ??
		//넓이 : ??
		//넓이 = 밑변 x 높이 / 2

		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));


		double width,height,area;

		//입력

		System.out.print("밑변?");
		width = Double.parseDouble(br.readLine());

		System.out.print("높이?");
		height = Double.parseDouble(br.readLine());

		//연산

		area = width*height/2;

		//출력
		System.out.println("밑변: " + width);
		System.out.println("높이: " + height);
		System.out.println("넓이: " + area);

		
	}

}
