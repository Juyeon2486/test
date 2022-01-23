package com.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ŭ������[java.lang.String]? ");//��Ű���� �̸��� Ŭ������ �̸��� ����. �Ʒ� ���������� 
		String str = br.readLine(); 					//Ŭ������ ��Ű���� �о�´�.
		
		Class cls = Class.forName(str); //����ڰ� �Է��� �̸��� cls�� ����. // ��
		
		//String�� ������ ����.
		System.out.println("������ ����...");
		Constructor<?>[] c = cls.getConstructors();//����Ʈ���� cls�� c�� �����´�.
		//����� �𸣱⿡ �迭�� ���� ?�� ��������
		for(int i = 0; i<c.length;i++) {
			System.out.println(c[i]); //�˻��� ������ ������ ����ض�.
		}
		
		System.out.println("�ʵ� ����..."); //�ʵ�� ������.
		
		Field[] f = cls.getFields();//java.lang.reflect
		for(int i = 0; i<f.length;i++) {
		System.out.println(f[i]); //		
		}
	
		System.out.println("�޼ҵ� ����..."); //�ʵ�� ������.
		Method[] m = cls.getMethods();//java.lang.reflect
		for(int i = 0; i<m.length;i++) {
		System.out.println(m[i]); //		
	}

    }
}