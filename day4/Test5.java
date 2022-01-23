package com.day4;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {

		//1~45까지의 수 중에서 6개의 난수를 발생시켜 크기순으로 정렬.
		//Random 이라는 함수 = 난수

		Random rd = new Random();

		int[] num = new int[6];
		int i,j,n,temp;

		n = 0;
		//0,1,2,3,4,5=6개 
		while(n<6) {  //(45)를 입력하면 0~44번까지 생성되므로 +1을붙여 각번호에 +1
			num[n] = rd.nextInt(45)+1;

			for(i=0;i<n;i++) {
				if(num[i]==num[n]) {
					n--;
					break;
				} 

			}
			n++;

		}
		//정렬
		for(i=0;i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {

				if(num[i]>num[j]) {

					temp = num [i];
					num[i] = num[j];
					num[j] = temp;


				}
			}
		}



		for(int su : num) {
			System.out.printf("%4d",su);
		}


	}

}
