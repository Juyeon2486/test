package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//�Է��� �������� �հ踦 ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum;
		char ch;
		//ch=choice�� ����
		
		while(true) {//���ѷ���
			
			do {
				System.out.print("���ϴ� ��?"); //100
				su = sc.nextInt();
			}while(su<1||su>5000);
		//do ~ while ���� �츮 ������ �ݴ� ������ �ٶ� �ȉ´ٸ� ����
			sum=0;
			for(int i=1; i<=su;i++) 
			  sum+=i; //==	//sum=sum+i; ����
			  
			
			System.out.println("1~" + su + "������ ��:" + sum);
			
			System.out.println("����ҷ�?[Y/N]");//Y,y,N,n,b,a,d,f
			ch = (char)System.in.read();
		//!= �� ����������, �������� �����̸� ||���&&�� ���
			if(ch!='Y' && ch!='y') {
				System.out.println("���α׷� ����");
				break;
				
				//while,do~while,for,switch,if���� break�� �ݺ����� �����϶�� ��
			}
		}
	}

}
