package com.day11;

import java.util.Scanner;

interface FruitA{
	
	String Won = "��";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA{
	
	public String getItems();
	
}

class Orange implements ItemFruit{//�������̽��� ���� ����� �����ϴ�.

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public String getItems() {
		return "����";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "���";
	}

	@Override
	public String getItems() {
		return "����";
	}
	
}
public class Test5 {

	public void packing(ItemFruit ob) {
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Test5 t = new Test5();
		
		System.out.print("1.������ 2. ���?");
		int n = sc.nextInt();
		
		if(n==1)
			t.packing(new Orange()); //new Orange ��ü�� ��ü�� �����Ѵ� �츮�� �����ϱ����� �տ� Orange = new Orange�� ǥ����
		else if (n==2)
			t.packing(new Apple());
		
		
		
		
		/*
		ItemFruit ob;
		ob = new Orange(); //ItemFruit�ڽ���  �θ𿡰� �־� ��ĳ��Ʈ�ϱ⶧���� ItemFruit�� �Է��ص� ������� ����.
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
		ob = new Apple();
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);*/
		
		/*int a ;
		a = 10; 
		System.out.println(a);//10
		
		int b ;
		b = 20;
		System.out.println(b);//20
		*/
		/*
		int a;
		a = 10;
		System.out.println(a);//10;
		
		 int b;
		 b = 10;
		 System.out.println(b);//20;
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
