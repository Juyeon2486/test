package com.day13;

import java.util.Hashtable;
import java.util.Iterator;

//Map(Interface) - HashTable(Class),HashMap(Class)
//HashTable : Vector�� ���� , ����ȭ�� ���������� �ӵ��� ���� �� �ִ�.
//HashMap : ArrayList�� ����, ����ȭ�� �������� ������ �ӵ��� ������.

//Map<key,value> Generic�� �ΰ�.
//key�� �ߺ����� ���� �� ����.(key:Set //Ű������ ���̶�� �ڷ��� .
//key�� �ߺ��Ǹ� ������ ���� ����ȴ�.(����)
//Map�� Iterator�� ����. 
//put(key,��) : �߰�
//it.next() : key�� ����
//get(key) : �������б� 


public class Test2 {
	//key
	public static final String[] tel = {
			"111-111","222-222","333-333","111-111","444-444"
	};
	
	//value
	public static final String[] name = {
			"�����","���γ�","���μ�","��������","���ξ�"
	};
	
	
	
	public static void main(String[] args) {
	    //Ŭ�����̱⿡ new�� ��ü ������ �ȴ�.
		Hashtable<String, String> h = new Hashtable<>();//Ű�� ������ �ڷ����� �����ش�.
		
		for(int i=0;i<tel.length;i++) { //name�� tel�� �����Ͱ��� 5�� ���⿡ name�̳� tel�� length�� ����
			h.put(tel[i], name[i]);
		}
		
		System.out.println(h); 
		
		String str;
		//key�� �ָ� value�� �����´�.
		str = h.get("111-111");
		if(str==null||str.equals("")) { //String�� equals�� �������� �񱳰��� null�϶� ==�� ����.
			System.out.println("�ڷ����!");
		}else {
			System.out.println(str);
		}
		//key�� �����ϴ��� �˻��ϴ°�. containsKey
		if(h.containsKey("222-222")) {
			System.out.println("222-222�� ����");
		}
		//�����Ͱ��� �����ϴ��� �˻� containsValue
		if(h.containsValue("���γ�")){
				System.out.println("���γ� ����");
	}
		
		//���� //Map�� ������ Ű
		h.remove("222-222"); //key�� ����.
		if(h.containsKey("222-222")) {//������ �����ϳ� ���ϳ� Ȯ���غ��� if��.
			System.out.println("222-222�� ����");
		}else {
			System.out.println("222-222�� �������� ����");
		}
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();; //key�� ����.
			String value = h.get(key);	//value�� ����. key�� �о� get�� �ְ� value�� �о��,
					
			System.out.println(key + ":" + value);		
						
		}
		
		
}

}