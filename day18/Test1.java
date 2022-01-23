package com.day18;

//Class 클래스 //클래스의 이름이 클래스다.
//특정 클래스나 인터페이스의 정보를 검색할 수 있는 메소드를 가지고 있다.

class Test{
	
	public void write() {
		
		System.out.println("테스트...");
		
	}
}

public class Test1 {

	public static void main(String[] args) throws Exception {
								//에러가 날 수 도 있으므로 예외처리.
		Class c = Class.forName("com.day18.Test");//다른 클래스의 이름을 적으면 그 클래스를 읽어와 내부적으로 사용가능하다.
					//포네임이 클래스를 읽어서 변수에 넣는다. 변수타입은 오브젝트
		Object o = c.newInstance();	 //객체 생성하는 메소드. 만들어진걸 씀 인스턴스변수나 인스턴스 메소드는 new를 만나야 사용가능.
		//c의 데이터 타입은 오브젝트로 생성한다.
		
		Test t = (Test)o; // 객체 생성후 다운캐스팅해서
		//o.write();// 부모는 write를 가지고 있지 않기때문에 자식껄 사용하려하는데 부모는 자식껄 사용할 수 없다. 
		//상속의 법칙.
		t.write(); //
		
		
		
		
	}

}
