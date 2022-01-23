package com.day11;

import java.util.Scanner;

interface FruitA{
	
	String Won = "원";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA{
	
	public String getItems();
	
}

class Orange implements ItemFruit{//인터페이스는 다중 상속이 가능하다.

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
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
		
		System.out.print("1.오렌지 2. 사과?");
		int n = sc.nextInt();
		
		if(n==1)
			t.packing(new Orange()); //new Orange 자체가 객체를 생성한다 우리가 접근하기위해 앞에 Orange = new Orange로 표현함
		else if (n==2)
			t.packing(new Apple());
		
		
		
		
		/*
		ItemFruit ob;
		ob = new Orange(); //ItemFruit자식을  부모에게 넣어 업캐스트하기때문에 ItemFruit를 입력해도 결과값은 같다.
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
