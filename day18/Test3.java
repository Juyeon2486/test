package com.day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//정규화 표현식
//java.util.regex 에 있다.

/*
c[a-z]*: c로 시작하는 영단어(c,ca,can) c로 시작하는 여러개의 단어
c[a-z]: c로 시작하는 영단어(c,ca,cz) *이없으면 c로 시작하는 2개의 단어
c[a-zA-Z0-9] : ca,cA,c4 가능하지만 두글자의 단어만 가능.
c. : c로 시작하는 두글자(ca,cB,c&)
c.* : c로 시작하는 모든 글자.
[b|c].* 또는 [bc].* 또는 [b-c].* : b,c,bbb //b나 c 사이의 모든 글자.

[\\d]+ 또는 [0-9]+  : 하나 이상의 숫자.  //0에서 9사이의 수로 시작하면서 + 여러가지 숫자
 */
public class Test3 {

	public static void main(String[] args) {

		String[] str = {"a","apple","banana","orange","car","count","b","music","movie","case"} ;
		
		Pattern p;
		
		p = Pattern.compile("c[a-z]*");
			for(String s : str) {
				Matcher m = p.matcher(s); //s에있는값을 매치해서 확인하고
				if(m.matches()) {//만약 매치한것과 같으면 출력
					System.out.println(s); 
				}
			}
		
			System.out.println("-------------");
			
			p = Pattern.compile("c."); // c. 두자리 //어떠한 패턴을 내가 지정해서 패턴을 뽑아내게끔 만든것.
			for(String s : str) {
				Matcher m = p.matcher(s); //s에있는값을 매치해서 확인하고
				if(m.matches()) {//만약 매치한것과 같으면 출력
					System.out.println(s); 
				}

			}
			
			System.out.println("-------------");
			//@뒤는 도메인.
			String[] mails = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@aaa"};
			
			// [\\w]+ : 한글자 이상의 영 , 숫자
			// @ 엣 여기에
			// (\\.[\\w]+) : 괄호안에 있는 것은 반드시 한번은 표시 되어야함.
			// \\. : \\.는 말그대로 도트 .abc 이런 구조가 반드시 한번은 와야한다는 뜻.
			
			String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";//이메일을 체크하는 패턴  //it 계열에서 전반적으로 사용되는 공통적인 
			//영문자숫자여러개 + @찍고 영문자 숫자여러개 + .찍고 영문자 여러개
			
			for(String s : mails) {
				
				if(Pattern.matches(pat, s)) { //pat을 패턴에 가져와서 스트링과비교해서 일치하면 s를 출력하라
					System.out.println(s);//이메일 형식이 맞는지 체크한다.
				}
			}
	}
}
