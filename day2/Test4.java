package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//���,�ݺ���
		//if, for, while, do~while, switch
		//��� if, swich
		//�ݺ��� for , while, do~while
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int su;
		String str = ""; //(�ʱ�ȭ�� ���ؼ� ""�� ����
	
		
		System.out.print("���Է�?");
		su = Integer.parseInt(br.readLine());
		//���� if��
	/*	//if(����)	
		if(su%2==0) {
			str = "¦��";
		}
		 //su%2==1�� ����. 	
		if(su%2!=0) {
			str = "Ȧ��";
		}  //�۾��� �ϳ� �϶��� { } ���ȣ�� �����Ͽ� �ᵵ�ȴ�.
		*/
		
		if(su%2==0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
		
		
		System.out.println(su + ":" + str);
		
}
	
}
		
		
