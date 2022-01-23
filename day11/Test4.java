package com.day11;

interface Test{
	
	public int total();
	public void write();
	
}

class TestImpl implements Test{

	private String hak,name;
	private int kor,eng;
	
	public TestImpl() {//�⺻������
		
	}
	
	public TestImpl(String hak,String name,int kor,int eng) { //�����ڷ� �ʱ�ȭ �����ε� �� ��ü �ʱ�ȭ
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	public void set(String hak,String name,int kor,int eng) {//�޼ҵ�� ��ü �ʱ�ȭ.
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
		
		if(ob instanceof TestImpl) { //Object ob�� �������� �ڷ��� TestImpl�̳Ĵ¶�
			
			TestImpl t = (TestImpl)ob; //downcast �� t�� ob�� �������� ob2�� t���ȴ�.
			
			if(this.hak.equals(t.hak)&&t.name.equals(this.name)) {
				flag = true;
			}//���⼭ equals�� �й��� �̸��� ��Ʈ���̱⿡ ��Ʈ���� equals�⶧���� ��Ʈ���� heap������ ���� ���Ѵ�.
			//�׷��Ƿ� ob1.hak��ob2.hak�� ���Ĵ� �ǹ� �ΰ��� "111" �� �����Ƿ� true
			
			
		}
		
		return flag;
	}
	
	
}

public class Test4 {

	public static void main(String[] args) {
		Test ob1 = new TestImpl("111","�����",80,90);
		Test ob2 = new TestImpl("111","�����",100,100);
		
		if(ob1.equals(ob2)){
			System.out.println("ob1�� ob2�� �����ι�!");
		}else {
			System.out.println("ob1�� ob2�� �����ι��ƴ�!");
		}
		
		ob1.write();
		ob2.write();
		
	}

}

