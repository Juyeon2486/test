package com.day16;

import java.io.FileInputStream;

//���� �о����
//FileInputStream.

public class Test5 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("e:\\doc\\test.txt");//���� ���� 5����6���� ����ġ��.
			
			
			int data;  //����� ��ȯ���� ��Ʈ.
			while((data=fis.read())!=-1) {//3����Ʈ�� �ѱ� �Է��� �Ϸ��Ҷ� '����'��� �ܾ ������ �Ѵܾ�� 2����Ʈ�̱⶧���� '��'�� ������ ��� �Է��� �ȵ�.
				
				//System.out.print((char)data); //ĳ���ͷ� ������ ������ �����⶧���� �ּ�
				//
				System.out.write(data); //�� ���� ���ͱ��� ǥ��, �پ��� ���ͱ��� ǥ�� �ϱ⶧���� �Ʒ� �÷�����������
				//�츮���� ������ ��µ�������.
				System.out.flush(); // �׷��Ƿ� �÷����� ���δ� ��µǰ��Ѵ�.
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
