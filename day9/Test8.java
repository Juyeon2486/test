package com.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result{

	public void print(String r) {
		System.out.println(r);
	}
}

class Calc extends Result {
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	public void TestA() throws IOException {
		System.out.print("¼ö½Ä?");//37+23?
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");
		
		for(String op : new String[] {"+","-","*","/"}) {
			int pos = str.indexOf(op);
			
			if(pos>-1) {
				
				int num1 = Integer.parseInt(str.substring(0, pos));
				int num2 = Integer.parseInt(str.substring(pos+1));
			
				int result = 0;
				char oper = str.charAt(pos);
				
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
				String sf = String.format("%d %c %d = %d", num1,oper,num2,result);
			
				System.out.println(sf);
				
			}
	
		}
		
	}
	
	
	
}





public class Test8 {

	public static void main(String[] args) throws IOException {
		Calc ca = new Calc();
		Result re = new Result();
		
		ca.TestA();
		String r = null;
		re.print(r);
		
	}

}
