package com.day14;

import java.util.Scanner;

import com.excep.MyException;

class MyAuthExcep{

	public void inputFormat(String str) throws Exception {

		//���� ����
		if(str.length()<5 || str.length()>10) {
			throw new Exception("���ڿ��� ���̴� 5~10�� �Դϴ�.");
		}

		//������ �ΰ� �ƴѰ�üũ
		//int eng=0;
		//int num=0;//�Ҹ����ε� ����
		//boolean eng = false;
		//boolean num = false;
		
		boolean eng,num;
		eng=num=false;  //������ ������ �ѹ��� �ʱ�ȭ �����ְ� ���� �� �̷��� ����� �� �ִ�.
		
		//���۰�    //����    //������
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);

			if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {//����� Ʈ�� , ���ڸ� Ʈ��
				eng = true;
			}else if(ch>='0'&&ch<='9') {
				num = true;
			}

		}
		if(eng==false||num==false)//Ʈ��Ʈ�� �� ������ �н� Ʈ�� �޽� , �޽� Ʈ�� �� ������ �Ʒ� ���� ���
		throw new Exception("������,���� ȥ�븸 �����մϴ�.");
	}
}
public class Test4 {

	public static void main(String[] args) {

		//5~10�� �̳��� �����ڸ� �Է¹޾� ����ϴ� ���α׷�.
		//���ڿ�:abcdefg
		//abcdefg

		//���ڿ�:abcd
		//���ڿ��� ���̴� 5~10�� �Դϴ�.

		//���ڿ�:abc2345
		//�����ڸ� �Է°����մϴ�.

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthExcep ob = new MyAuthExcep();

		try {

			System.out.print("���ڿ�?");
			str = sc.next();

			ob.inputFormat(str);

			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
