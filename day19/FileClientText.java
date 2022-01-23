package com.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientText {

	public static void main(String[] args) {

		int port = 7777;
		String host = "127.0.0.1"; //�ڱ� �ڽŰ� �����׽�Ʈ�غ��� �ٸ���� ip�� ���ָ� ��.
		Socket sc = null; //������ �ΰ����� �ʱ�ȭ
		
		ObjectOutputStream oos = null; //������ ������ �������ϴ� ObjertInputStream ois 
									   //Ŭ���̾�Ʈ�� ������ �޾ƾ��ϴ� ObjertOutputStream oos
		
		Scanner scn = new Scanner(System.in);
		
		String filePath;
		
		try {
			
			System.out.print("������ ���ϰ�� �� ���ϸ�?"); //e:\\doc\\a.txt
			filePath = scn.next(); //��������� ���� ��ο� ���ϸ��� �����н���
			
			File f = new File(filePath); //���� �����н��� ���Ͽ�
			
			if(!f.exists()) { //���� f�� ������ ����?��¶�
				System.out.println("������ �����ϴ�.");
				System.exit(0);//������ �����Ƿ� �����ϸ� �ȉ�
			}
			
			sc = new Socket(host, port); //���Ʈ �ϱ������� ������ Ȧ�� (��������)
			 
			oos = new ObjectOutputStream(sc.getOutputStream()); // sc�� ���� �ƿ�ǲ��Ʈ���� �޾Ƽ� oos�� �ش�
			oos.flush();
			
			FileInfo info; //���� ������ �����͸� �ޱ����� �غ�
			//�޸𸮻󿡼� �̷����.
			info = new FileInfo(); //������ ����� �𸣴� ���������� �ϳ���
			info.setCode(100); // ���� ���� ����(�����̸�)
			info.setData(f.getName().getBytes()); //f = ���Ͽ� ���� �̸��� ����Ʈ�� �о�´�
			info.setSize((int)f.length()); //int�� ����ȯ String���� �޾ƿԱ⿡
			
			oos.writeObject(info);
			System.out.println(f.getName() + "�������� ����.");
			
			Thread.sleep(30); // �޸𸮻󿡼� �̷�����°� �������� 0.03�ʾ� �����.
			
			//���ϳ�������
			FileInputStream fis = new FileInputStream(f);
			
			int data = 0;
			byte[] buffer = new byte[1024]; //������������ 1024�� ��������� 1024�� ����
			
			while((data=fis.read(buffer,0,1024))!=-1) { //�Ʒ��� ������ �����Ͱ� �ö�� ���Ϲ��� �ݺ��Ǹ鼭 ���۰� �ʿ�
				
				info = new FileInfo(); //Ŭ������ ����� �Ʒ��� �����͸� ����
				
				info.setCode(110);//������ ���������̶�� ��ȣ
				info.setSize(data); //������ ũ��� �������� �縸ŭ
				info.setData(buffer);//������ �����ʹ� ������ ũ�⸸ŭ
				
				oos.writeObject(info); //�������.
				System.out.println(data + "bytes ������..."); 
				
				buffer = new byte[1024]; //���۰� ���Ϲ� ���� �����⶧���� �迭��ŭ ��ü����
				
				Thread.sleep(300); //0.3�ʸ�ŭ �����
			}//end while
			
			fis.close();
			
			//���� ���� ����
			
			info = new FileInfo(); //������ ����� �𸣴� ���������� �ϳ���
			info.setCode(200); // ���� ���� ����(�����̸�)
			info.setData(f.getName().getBytes()); //f = ���Ͽ� ���� �̸��� ����Ʈ�� �о�´�
			info.setSize((int)f.length()); //int�� ����ȯ String���� �޾ƿԱ⿡
			
			oos.writeObject(info);
			System.out.println(f.getName() + "�������� ��.");
			
			Thread.sleep(30);
			
			oos.close(); //�������� ����
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
