package com.day16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//��ü�� ����ȭ
//�޸𸮿� ������ Ŭ���� ��ü�� �ν��Ͻ� ������ ���� ���¸�
//�״�� ���Ͽ� ���� �ϰų� ��Ʈ��ũ�� ���ؼ� ���� �� �� �ִ� ���.
//������ byte �����θ� �����͸� �ۼ��� �� �� �ִ�.

//������ ��ü�� ������ ����� ���Ŀ� ���� �����ʰ� ��ü�� 
//���Ͽ� ���������ν� ���Ӽ��� ������ �� �ְ� ��ü ��ü��
//��Ʈ��ũ�� ���ؼ� �ս��� ��ȯ�� �� �ִ�..

//implements Serializable
//�޼ҵ尡 ����.

public class Test15 {

	public static void main(String[] args) throws Exception {
		
		Hashtable<String, String> h = new Hashtable<>();//�ؽ����̺� �ø������������ �ֱ⿡ �������ȳ�
		
		h.put("1", "�����");
		h.put("2", "���γ�");
		h.put("3", "���μ�");
		
		FileOutputStream fos = new FileOutputStream("e:\\doc\\out6.txt");//fos�� ���Ѱ� oos ����ȭ�� �����͸�
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(h);
		oos.close();
		fos.close(); //���� �׻� �ݾ�����
		
		System.out.println("����ȭ ������ ���� ����");

	}

}
