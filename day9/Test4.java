package com.day9;

//StringBuffer
//StringBuilder
//String < StringBuffer < StringBuilder �ӵ���.
public class Test4 {

	public void StringTime() {

		System.out.println("String Test....");

		//long start = System.currentTimeMillis();
		long start = System.nanoTime();

		String str = "A";
		for(int i=1;i<50000;i++) {
			str += "A";	
		}

		long end = System.nanoTime();

		System.out.println("����ð�:" + (end-start));


	}

	public void StringBufferTime() {
		System.out.println("StringBuffer Test....");

		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("A");
		for(int i=1;i<50000;i++) {
			str.append("A");
		}

		long end = System.nanoTime();

		System.out.println("����ð�:" + (end-start));


	}

	public void StringBuilderTime() {
		System.out.println("StringBuilder Test....");

		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("A");
		for(int i=1;i<50000;i++) {
			str.append("A");	
		}

		long end = System.nanoTime();

		System.out.println("����ð�:" + (end-start));


	}

//����ӵ��� ����.
	public static void main(String[] args) {

		Test4 ob = new Test4();
		ob.StringTime();
		ob.StringBufferTime();
		ob.StringBuilderTime();
	}

}
