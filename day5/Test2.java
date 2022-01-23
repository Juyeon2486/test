package com.day5;

public class Test2 {

	public static void main(String[] args) {

		int[] num = {37,26,19,12,7};

		int i,j,temp;


		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);

		}
		System.out.println();

		//Bubble sort 셀렉션솔트와 결과값은 같지만 방식이 다름 주로 셀렉션 솔트를 사용한다.
		for(i=1;i<num.length;i++) {
			for(j=0;j<num.length-i;j++) {

				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}


			}
		}




		System.out.print("Sorted Data: ");
		for(int s : num) {
			System.out.printf("%4d",s);

		}
		System.out.println();


	}

}
