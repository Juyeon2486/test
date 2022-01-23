package com.day11;

class SuperTest{
	
	public int a=10,b=20;
	
	public void write() {
		System.out.println("슈퍼클래스 write() 메소드...");
	}
	
	public int hap() {
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b=100,c=200;
	
	public void print() {
		System.out.println("서브클래스 print() 메소드...");
	}

	@Override
	public int hap() {
		return a + b + c; //310
	}

}


public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		System.out.println(ob1.b); //100
		
		SuperTest ob2 = ob1; //upcast ob1을 ob2에 넣음으로 자식을 부모화 시키는 업캐스트
		System.out.println(ob2.b);//20
		
		System.out.println(ob2.hap());//ob2의 hap 가져와도 ob1 서브테스트에 hap있기때문에 
									  //부모와 자식이 둘다가지고있으면 무조건 자식껄 실행한다
		ob2.write();
		
		//ob2.print(); //4 내꺼는 내꺼다. ob2가 부모이기에 자식껄 부모가 사용할수없다
		
		((SubTest)ob2).print(); //downcast 부모를 자식으로 바꾸는 것.
	}

}
