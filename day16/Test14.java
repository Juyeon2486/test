package com.day16;

import java.io.File;
import java.io.FileFilter;

class MyFileList implements FileFilter	{

	private File f; //���� Ž���� ������ ������ �� �� �ִ�.
	
	public MyFileList(String filePath) { //�����ڸ� �����ε��Ͽ� ���
		f = new File(filePath);
	}
	
	public void result(){
		try {
			
			if(!f.exists()){
				System.out.println("������ �������� �ʽ��ϴ�.");
				return;
			}
			
			System.out.println("������: " + f.getAbsolutePath());
			System.out.println("����ũ��: " + f.length());
													   //user.dir�� ������. ������ιٲٸ� �ȉ�.
			String p = System.getProperty("user.dir"); //�ܿ�� ����. //�ý����� �������µ� ������� ���丮�� �����޶�.
			System.out.println("���� ������Ʈ ���: " + p);
			
			
			if(f.isDirectory()) {//���丮�� ������ �о�� //������ ������ ������¶�
				
				//����,���� ����
				File[] lists = f.listFiles(this); //this�� �Ʒ� ���Ʈ ���� �������� ��ο� ���ϵ��� �����̶�� �迭�� �־��ش�.
				
				System.out.println("������ ����...");
				for(int i=0;i<lists.length;i++) {
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			System.out.println("�� ��Ƽ�� �̸�...");//�ϵ� ��ũ�� �� ��Ƽ��
			File[] root = File.listRoots();
			for(int i=0;i<root.length;i++) {
				System.out.println(root[i].getPath());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public boolean accept(File pathname) {//�����͸� ������ ���Ʈ�� �־��ش�.
		
		return pathname.isFile()||pathname.isDirectory(); //���� ����������.
	}
	
}


public class Test14 {

	public static void main(String[] args) {

		MyFileList m = new MyFileList("e:\\doc");//���ϴ� ��θ� ������ ������������ �� �����ش�.
		m.result();
		
	}

}
