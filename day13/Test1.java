package com.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		Iterator<String> it = lists.iterator();//��̸���Ʈ�� ���ͷ����ͷ� ����.
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		//ListIterator //�Ϲ����� �����͸� ���� �� �ְ� ������ ���� �� �ִ�.
		ListIterator<String> it1 = lists.listIterator();
		while(it1.hasNext()) {
			System.out.print(it1.next() + " ");
		}
		System.out.println("\n-------------");
		
		while(it1.hasPrevious()) { //hasPrevious�� ���� ������ �������ε� ���� �� �ִ�.
			System.out.print(it1.previous() + " ");
		}
		System.out.println();
		
		List<String> lists1 = new ArrayList<>();
		lists1.addAll(lists);//addAll�� �̿��Ͽ� �÷����� ������ �� �ִ�.
		lists1.add("��õ"); //lists1�� ��õ�� �߰�(add)�Ѵ�.
		
		int n = lists1.indexOf("�λ�");//�λ��� �ε��� +1 �Ѱ��� ���ָ� �־��.
		lists1.add(n+1,"����");
		
		for(String s : lists1) { //String s�� lists1�� ����϶�.
			System.out.print(s + " ");
		}
		System.out.println("\n---------------");
		
		Iterator<String> it2 = lists1.iterator();
		while(it2.hasNext()) {
			String str = it2.next();
			if(str.startsWith("��")) {//String�� �޼ҵ� �ȿ� ����ִ´ܾ �����̸� ���.  
				System.out.println(str);//startWith�� String�� �޼ҵ� ù���ڸ� ã�Ƴ���.
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
