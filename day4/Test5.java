package com.day4;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {

		//1~45������ �� �߿��� 6���� ������ �߻����� ũ������� ����.
		//Random �̶�� �Լ� = ����

		Random rd = new Random();

		int[] num = new int[6];
		int i,j,n,temp;

		n = 0;
		//0,1,2,3,4,5=6�� 
		while(n<6) {  //(45)�� �Է��ϸ� 0~44������ �����ǹǷ� +1���ٿ� ����ȣ�� +1
			num[n] = rd.nextInt(45)+1;

			for(i=0;i<n;i++) {
				if(num[i]==num[n]) {
					n--;
					break;
				} 

			}
			n++;

		}
		//����
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
