package com.day16;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File Ŭ����
//���� �� ������ ���� �� �� �ֵ��� ����� �������ִ� Ŭ����
//������ ���� �Ǵ� �̸����� ���� ������ �� ��쿡�� ���ɻ�
//������ ������ ����� �ϱ����� �޼ҵ带 ���������� �ʴ´�.

public class Test12 {

	public static void main(String[] args) throws IOException {

		File f = new File("e:\\doc\\test.txt"); //�̰�θ� �о�ͼ� f�� �ִ´�.
		
		System.out.println("���ϸ�: " + f.getName());//���� Ŭ���� 
		System.out.println("���ϱ���: " + f.length());
		System.out.println("���ϰ��: " + f.getAbsolutePath());
		System.out.println("ǥ�ذ��: " + f.getCanonicalPath());
		System.out.println("���糯: " + new Date(f.lastModified()));//new�� ��ü�� �����ϸ鼭 ��¥�� �����ش� //��¥�� �����ֱ⸸�ϴµ� ���
		System.out.println("�����н�: " + f.getParent());
		System.out.println("�б�Ӽ�: " + f.canRead());
		System.out.println("����Ӽ�: " + f.canWrite());
		
		
		
		
		
		
	}

}
