package com.day9;

public class Test6 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String[] ss = s1.split(","); 
		
		for(String s : ss)
			System.out.print(s + " ");
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
	//equalsIgnoreCase 대소문자 구분하지말고 구분하라는뜻 그렇기에 true가 나옴
		
		String s4 =	"abc.def.hij";
		//			 01234567890
		System.out.println(s4.indexOf("."));//3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//-1
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s",""));
		
		char ch = "abcdefg".charAt(2);//c
		System.out.println(ch);
		
		System.out.println("abcdefg".length());//7
		
		String s8 = "abcdefg";
		String s9 = "abceefg";
		//아스키값으로 구분 사전식배열.
		System.out.println(s8.compareTo(s9));//-1
		System.out.println(s9.compareTo(s8));//1
		//String의 기본 요정도는 알고있어야 한다.
	}

}
