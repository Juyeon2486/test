package com.day12;

import java.util.Calendar;

//4.����Ŭ����(�͸���,������,AnonymousŬ����) //���� ���

public class Test4 {

	public Object getTitle() {
		
		return new Object() { //������Ʈ�� �������̽� �Ϲ������� �������̽��� ���� ����Ѵ�.
			
			@Override
			public String toString() {
				return "�͸��� Ŭ����"; 
			}
		};
	}
	
	public static void main(String[] args) {

		Test4 ob = new Test4();
		
		Object str = ob.getTitle();
		
		System.out.println(str);
		
	
		
	}

}
