package com.day10;

abstract class SortInt {

	private int[] value;

	protected abstract void sorting();// 추상메소드

	public void sort(int[] value) { // value:배열

		this.value = value;

		sorting(); //
	}

	public int length() {

		if (value == null) {
			return 0;
		}
		return value.length;
	}

	protected final int compare(int i, int j) {
		if (value[i] == value[j])
			return 0;
		else if (value[i] > value[j]) {
			return 1;
		} else
			return -1;
	}

	protected final void swap(int i, int j) {
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

	public void print() {

		if (value == null)
			return;

		for (int su : value) {
			System.out.printf("%4d", su);
		}
		System.out.println();
	}
}

class SortTest extends SortInt {
	@Override
	protected void sorting() {

		// Selection Sort
		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {

				if (compare(i, j) > 0) {
					swap(i, j);
				}
			}
		}
	}
}

public class Test9 {

	public static void main(String[] args) {

		int[] value = { 50, 34, 56, 98, 23 };

		SortTest ob = new SortTest();

		ob.sort(value);
		ob.print();
	}

}