package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
	
        BufferedReader br = new BufferedReader(
        		new InputStreamReader(System.in));//123
       
        //System.in : Ű����� �Է��ϴ� 1byte�� ����
        //InputStreamReader : System.in���� ���� 1byte�� ����(2byte)�� ����
        //BufferedReader : �޸𸮻� ���� ���� ����
        
        
        double r;
        double area,length;
        
        System.out.print("������?");//10
        
       r = Double.parseDouble(br.readLine());
        
       area = r*r*3.14;
       length = r*2*3.14;
       
       System.out.println("������: " + r);
       System.out.println("����: " + area);
       System.out.println("�ѷ�: " + length);

      
       
        	
		
		
		
		
		

	}

}
