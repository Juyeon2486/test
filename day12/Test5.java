package com.day12;

import java.util.Vector;

//Collection Framework(�����)

//�迭�� ����
//1.ũ�⸦ ���ϸ� ������ �Ұ���
//2.�̸� ũ�� ������ �޸� ���� �� �� ����
//3.�迭���̿� ������ �Ұ����ϴ�.

//List,Vector,Set,Map,Hashtable,TreeSet,HashSet

//List(I) - ArrayList(Class),Vector(Class) ��̸���Ʈ ����ȭ ���x ���� / ���� ����ȭ ���o ����

//Map(I) - Hashtable(class),HashSet(Class)
public class Test5 {
  
	
	public static void main(String[] args) {
//Vector<E>���� E�� ���ʸ� :������ ��ɷ� �Ұų� ���°�.
		Vector v = new Vector<>(); //�⺻ ������ type�� Object�̴�. 
		//�ڷ��� ������� ���𰡴�������,��½� �ٿ�ĳ��Ʈ�ؾ��Ѵ�.
		
		v.add("����"); //upcast
		v.add(30);
		v.add('c');
		
		String s = (String) v.get(0); //downcast
		System.out.println(s);
		
		Integer i = (Integer) v.get(1);
		System.out.println(i);
		
		char c = (char) v.get(2);
				
		
		
		
		
	}

}
