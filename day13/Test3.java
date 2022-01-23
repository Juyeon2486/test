package com.day13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		//Set : �ߺ����� ������� �ʴ´�.

		Set<String> s = new HashSet<>();

		s.add("����");
		s.add("�λ�");
		s.add("�뱸");

		System.out.println(s);

		s.add("����");//Set�� add�� �ߺ����� ������� �ʱ⶧���� �� ���￡ ���������.

		System.out.println(s);

		System.out.println("---------------------");

		//Stack
		Stack<String> st = new Stack<>();

		st.push("����");
		st.push("�λ�");
		st.add("�뱸");

		while(!st.empty()) {
			System.out.println(st.pop());//������ �������� ���´�. pop.
		}
		System.out.println("---------------------");
		//Queue
		Queue<String> q = new LinkedList<>();

		q.offer("����");
		q.offer("�λ�");
		q.offer("�뱸");
		q.add("����");

		while(q.peek()!=null) {//�����Ͱ� ������ ����
			System.out.println(q.poll());
		}

		//System.out.println(q);
		System.out.println("---------------------");

		List<String> lists1 = new LinkedList<>();
		//��� ����Ʈ���� �Ȱ��� �����.
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");

		List<String> lists2 = new LinkedList<>();

		lists2.add("����");
		lists2.add("�λ�");
		lists2.add("�뱸");

		lists2.addAll(lists1);



		System.out.println("lists1...............");
		for(String ss : lists1) {
			System.out.println(ss);
		}

		System.out.println("\nlists2...............");
		for(String ss : lists2) {
			System.out.println(ss);
		}

		lists2.subList(2, 5).clear();

		System.out.println("\nlists2...............");
		for(String ss : lists2) {
			System.out.println(ss);
		}

		String[] str = {"��","��","��","��","��","��",};
		for(String ss : str) {
			System.out.print(ss + " ");
		}

		System.out.println();
		Arrays.sort(str);
		for(String ss : str) {
			System.out.print(ss + " ");
		}


	}

}
