package com.day12;

//3. ����Ŭ����(��ø)
//static���� Ŭ���� �����.

class Outer3{
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		
		int c = 30; 
		
		public void write() {
			
			System.out.println(a);
			//System.out.println(b); b�� static�� �ƴϱ⶧���� ��ü������ ���־���ϱ⶧���� ��������.
			System.out.println(c);//a��c�� static�̱⶧���� �������.
			
			Outer3 ob = new Outer3();
			System.out.println(ob.b);
			
			
			
		}
		
		
	}
	
	public void print() {
		System.out.println(b);
	}
}


public class Test3 {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		out.print();
	
	}

}
