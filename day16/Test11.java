package com.day16;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos;
			PrintStream ps;
			
			fos = new FileOutputStream("e:\\doc\\out4.txt");
			ps = new PrintStream(fos);
			//print �ȉ� println�� �־�� �Էµ�. ���Ͱ� �־����.
			ps.println("�̼���");
			ps.println("ȫ�浿");
			ps.println("����");
			
			ps.close();
			fos.close();
			
			fos = new FileOutputStream("e:\\doc\\out4.txt",true);//���Ͼƿ�ǲ��Ʈ���� ����Ʈ��Ʈ��. ���� ¦�������������� Ʈ�簡 �ǹ̰�����
			ps = new PrintStream(fos); //���� ¦���� ���������� Ʈ�簡 �ǹ̰�����.
			ps.println("�����");
			ps.println("���γ�");
			ps.println("������");
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
