package com.day16;

import java.io.IOException;

//Stream
//������ ����½� ��� �����͸� ���¿� ������� �Ϸõ� �帧���� �����ϴ°�.
//�����Ͱ� �̵��ϴ� ������ �����̶�� ����.
//in�� ���� �⺻ Stream�̴�.
public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;
		//while���� ���ǽ��� true �� ��쿡 ����ؼ� �ݺ��Ѵ�.
		System.out.print("���� �Է�:");//�ý����θ��� ���ڸ� 1����Ʈ�� �޾ƿ´�
		while((data = System.in.read())!=-1) {//�ý��� �� ����� ���� ���� -1�� ���� ������ true�̸� data�� ��
			char ch = (char)data; //ĳ���� ch�� (char)data; ĳ���͸� ����ϱ� ���� char�� ������
			System.out.print(ch);//ch�� ����ض�
		}
			
		
		
	}	

}
