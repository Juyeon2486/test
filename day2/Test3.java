package com.day2;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		//�ڷ��� char(ĳ����) ��ȣ�� ����
		
		//String str = "suzi"; //String�� " ū����ǥ 
		//char�� �ѱ��ڸ� ���� //char�� ' ��������ǥ
		//Ascill��+�������� = Unicode 0~65535(���ھƴ� ��ȣ)
		char ch,result;
		
		System.out.print("�Ѱ��� ����?");//a(97)
		
		ch = (char)System.in.read(); //97
		//System.in.read()�� ����ϸ� int�� ��ȯ���ֱ⶧���� �ٽ� ��ȣ�� ��ȯ������ (char)�� �־��ش�
		
		//System.out.println(ch);//a
		//System.out.println(Integer.toString(ch));
		//char ch = 'a'=Unicode97�� ����.
		//97
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch + ":" + result);
		
		
		
		
		
		
	}

}
