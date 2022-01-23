package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//10명 이내의 이름과 점수를입력받아
		//점수가 높은사람에서 낮은사람 순으로 출력(점수내림차순)
		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;

		int i,j,inwon,temp1;
		String temp2;

		do {
			System.out.print("인원수?[1~10]");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);

		//배열 메모리 할당(=객체생성).
		//new 로 만들면 자료형의 기본값이 들어가있다. String=nell,int=0.

		name = new String[inwon];
		score = new int[inwon];

		for(i=0;i<inwon;i++) {
			System.out.print("이름?");
			name[i] = sc.next();
			System.out.print("점수?");
			score[i] = sc.nextInt();
		}//아래주석이 기므로 위 for문으로 줄여서 쓸수있다.
		/*System.out.print("이름?");//suzi
		name[0] = sc.next();
		System.out.print("점수?");//50
		score[0] = sc.nextInt();

		System.out.print("이름?");//inna
		name[1] = sc.next();
		System.out.print("점수?");//70
		score[1] = sc.nextInt();

		System.out.print("이름?");//lisa
		name[2] = sc.next();
		System.out.print("점수?");//100
		score[2] = sc.nextInt();*/

		//총점 정렬

		for(i=0;i<score.length-1;i++) {

			for(j=i+1;j<score.length;j++) 

				//System.out.println(i + " : " + j);
				if(score[i]<score[j]) {

					temp1 = score[i];
					score[i]  = score[j];
					score[j]  = temp1;

					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
		}
		//두개의 배열을 입력해야 할땐 확장 for 문 사용 불가 한개의 배열만 확장for문 사용가능.
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s %4d\n",name[i],score[i]);
		}
	}
}