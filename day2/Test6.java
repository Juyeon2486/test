package com.day2;

import java.util.Scanner;

//Scanner�� �ܶ����ڸ� �����ؼ� �����͸� �Է�
//�⺻ �ܶ��� ����

public class Test6 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	//����
	String name;
	int kor,eng,mat;
	
	System.out.print("�̸� ���� ���� ����?");//suzi 40 50 70
	//System.out.print("�̸�,����,����,����?");//suzi,40,50,70
	
	//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
	// \\s*,\\s* �� ���� \\s* ���� ��ȣ�� ����ȭ ǥ�����̶�� �ϸ� ������ ���������� ����Ѵ�.
	
	name = sc.next();
	kor = sc.nextInt();
	eng = sc.nextInt();
	mat = sc.nextInt();
	
	System.out.println(name + ":" + (kor+eng+mat) + "��");
	
	
		
		
		
	}

}