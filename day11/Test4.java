package com.day11;

interface Test{
	
	public int total();
	public void write();
	
}

class TestImpl implements Test{

	private String hak,name;
	private int kor,eng;
	
	public TestImpl() {//기본생성자
		
	}
	
	public TestImpl(String hak,String name,int kor,int eng) { //생성자로 초기화 오버로딩 후 객체 초기화
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	public void set(String hak,String name,int kor,int eng) {//메소드로 객체 초기화.
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak + "," + name + "," + total());
	}
	
	@Override
	public boolean equals(Object ob) {//ob1.equals(ob2) upcast,TestImpl ob = ob2 ob1 = TestImpl
		
		boolean flag = false;
		
		if(ob instanceof TestImpl) { //Object ob가 오리지널 자료형 TestImpl이냐는뜻
			
			TestImpl t = (TestImpl)ob; //downcast 로 t에 ob를 넣음으로 ob2는 t가된다.
			
			if(this.hak.equals(t.hak)&&t.name.equals(this.name)) {
				flag = true;
			}//여기서 equals는 학번과 이름이 스트링이기에 스트링의 equals기때문에 스트링은 heap영역의 값을 비교한다.
			//그러므로 ob1.hak과ob2.hak이 같냐는 의미 두개다 "111" 로 같으므로 true
			
			
		}
		
		return flag;
	}
	
	
}

public class Test4 {

	public static void main(String[] args) {
		Test ob1 = new TestImpl("111","배수지",80,90);
		Test ob2 = new TestImpl("111","배수지",100,100);
		
		if(ob1.equals(ob2)){
			System.out.println("ob1과 ob2는 동일인물!");
		}else {
			System.out.println("ob1과 ob2는 동일인물아님!");
		}
		
		ob1.write();
		ob2.write();
		
	}

}

