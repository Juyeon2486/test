package com.day19;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest {
	
	class WorkThread extends Thread {
		
		private Socket sc = null;
		
		public WorkThread(Socket sc) {
			this.sc = sc;
		}
		
		@Override
		public void run() { //�����带 ��� ������ �� �������̵�
			
			try {
				
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream()); //sc�� �Ѿ��.
				
				System.out.println(sc.getInetAddress().getAddress()+"����!");
				
				FileOutputStream fos = null;
				Object ob = null;
				//�Ѿ���� ������ sc�� ������� ũ������ �𸣴ϱ� ���Ϲ����� �޴´� 
				while((ob = ois.readObject())!=null) {
					
					if(ob instanceof FileInfo) { //�Ѿ���� �����Ͱ� ����������?
						
						FileInfo info = (FileInfo)ob; //������Ʈ�� ���������� �ٿ�ĳ����.
						
						if(info.getCode()==100) { //���� ���� ����
							
							String str = new String(info.getData()); //info�� �����͸� �޾Ƽ� ����ȭ�ؼ� str�� �־��
							
							fos = new FileOutputStream(str);//�޾Ƽ� ���Ͼƿ�ǲ��Ʈ���� �־ fos�� �־� ���� ����
							
							System.out.println(str + " ���� ���� ����!");
							
						}else if (info.getCode()==110) { //���� ������.
							
							if(fos==null)
								break; //���� fos�� ���̸� while���� ����������.
							
							fos.write(info.getData(),0,info.getSize()); //info�� ������ �����ŭ 0���� �޴´�.
							
							System.out.println(info.getSize() + "bytes �޴���!");//�޴������� ���.
							
							
						}else if (info.getCode()==200) { //���� ���� ����
							
							if(fos==null)
								break; //���� fos�� ���̸� while���� ����������.
							
							String str = new String(info.getData());//���� �޾ƿ��°�
							
							fos.close(); //fos����
							
							System.out.println(str + "���� ���� ��!");
							
							break; //�������� �ٳ������� while�� ���� ������.
						}
						
					}
					
					
				}//end..while // ��ȣ�� �Ҿ������ �ʱ����� ���Ϲ��� �����ٴ� �ּ��� �޾��ش�.
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

	public void serverStart() {
		
		try {
			ServerSocket ss = new ServerSocket(7777); //��������
			System.out.println("Ŭ���̾�Ʈ ���� �����!");
			
			Socket sc = ss.accept(); //Ŭ���̾�Ʈ ����
			
			WorkThread wt = new WorkThread(sc);//sc�� wt��
			wt.start(); //
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		
		new FileServerTest().serverStart(); //���ϼ����׽�Ʈ�� ���ϼ����� ��ü����.
	}

}
