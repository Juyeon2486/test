package com.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print("수식?");//37+23?
		String str = br.readLine();

		str = str.replaceAll("\\s","");

		//System.out.println(str); 중간에 한번씩 체크.

		/*String[] oper = {"+","-","*","/"};
		for(String op : oper) {*/
		for(String op : new String[] {"+","-","*","/"}) {

			int pos = str.indexOf(op);

			if(pos>-1) {

				int num1 = Integer.parseInt(str.substring(0, pos));
				int num2 = Integer.parseInt(str.substring(pos+1));

				//System.out.println(num1 + ":" + num2);
				int result = 0;
				char oper = str.charAt(pos);

				//System.out.println(oper);
				switch(oper) {
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;
				}
				//★
				//System.out.printf("%d %c %d = %d", num1,oper,num2,result);
				//printf는 그자리에서 실행 String.format은 변수에 저장해두어
				//다른곳에서도 사용가능하다.
				String sf = String.format("%d %c %d = %d",
						num1,oper,num2,result);

				System.out.println(sf);
				//★

			}

		}

	}

}
