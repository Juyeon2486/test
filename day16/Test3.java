package com.day16;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte Stream�� 2btye Stream���� ��ȯ���ִ� Stream �̴�.
//�긴�� ��Ʈ��. //���������� ����Ҽ� ���⿡

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data; // int data�� ��������
		System.out.println("���ڿ�?"); //���ڿ�? ���
		
		Reader rd = new InputStreamReader(System.in);//Reader�� �����? ���� ���� 
		//InputStreamReader(System.in)�� new�� ��ü�����Ͽ� ����ϱ� ������ �������� IOException ����ó���� ���ش�.
		
		while((data = rd.read())!=-1) {//rd.read�� ���� ���� -1�� ���������� (!=-1) data ���� ��
			
			char ch = (char)data; //char ch ĳ���ͷ� ch ���� ���� data ������ ����ϱ����� (char)�� ��ȯ
			System.out.print(ch); //ch ���
		}
	}

}
