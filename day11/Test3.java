package com.day11;

//Interface 
//추상클래스의 일종으로 선언만하고 정의(내용)가없다.
//변수는 final 변수만 선언가능하다.
//인터페이스를 구현 하기 위해서는 implements를 사용한다.
//인터페이스를 상속,구현했으면 인터페이스의 모든 메소드를 재정의(Override) 해야 한다.
//재정의 하지않으면 무조건 컴파일 오류가 난다.
//인터페이스가 다른 인터페이스를 상속받을 수 있다. 그때는 extends를 사용한다.
//클래스는 단일 상속 이지만 인터페이스는 다중 구현(implements)이 가능하다.

interface Fruit{
	
	String Won = "원"; //public static final이 생략되어있다 무조건 퍼블릭. 가져다 써야하기때문이 프라이빗으로 만들수없다
	
	int getPrice();//public abstract 생략.
	
	public String getName();
	
	//public void print(); 일반메소드는 만들 수 없다.
}

class Fruitimpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	//오버라이드로 만들거나
	public String getItems() {
		return "과일";
	}
	//자체적으로 만든다
}

public class Test3 {

	public static void main(String[] args) {

		Fruitimpl ob1 = new Fruitimpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;//upcast
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems); //부모에 겟아이템이 없기에 사용할수없다.
		
	}

}
