package com.day14;

import java.util.Scanner;

import com.excep.MyException;

class MyAuthExcep{

	public void inputFormat(String str) throws Exception {

		//문자 길이
		if(str.length()<5 || str.length()>10) {
			throw new Exception("문자열의 길이는 5~10자 입니다.");
		}

		//영문자 인가 아닌가체크
		//int eng=0;
		//int num=0;//불린으로도 가능
		//boolean eng = false;
		//boolean num = false;
		
		boolean eng,num;
		eng=num=false;  //변수가 많은데 한번에 초기화 시켜주고 싶을 때 이렇게 사용할 수 있다.
		
		//시작값    //끝값    //증가값
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);

			if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {//영어면 트루 , 숫자면 트루
				eng = true;
			}else if(ch>='0'&&ch<='9') {
				num = true;
			}

		}
		if(eng==false||num==false)//트루트루 가 나오면 패스 트루 펄스 , 펄스 트루 가 나오면 아래 에러 출력
		throw new Exception("영문자,숫자 혼용만 가능합니다.");
	}
}
public class Test4 {

	public static void main(String[] args) {

		//5~10자 이내의 영문자를 입력받아 출력하는 프로그램.
		//문자열:abcdefg
		//abcdefg

		//문자열:abcd
		//문자열의 길이는 5~10자 입니다.

		//문자열:abc2345
		//영문자만 입력가능합니다.

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthExcep ob = new MyAuthExcep();

		try {

			System.out.print("문자열?");
			str = sc.next();

			ob.inputFormat(str);

			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
