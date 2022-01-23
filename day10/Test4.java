package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//년,월,일을 입력받아 100(X)일후 년월일(요일)
		/*년도?2016
		월?4
		일?20
		몇일후?100

		만 난 날 : 2016년 4월 20일 수요일
		100일 후 : 2016년 7월 29일 금요일
		*/
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		int y,m,d,w,h,x;
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		do {
			System.out.println("년도?");
			y = sc.nextInt();
		}while (y<1);
		
		do {
			System.out.println("몇월?");
			m = sc.nextInt();
		}while (m<1||m>12);
		
		do {
			System.out.println("몇일?");
			d = sc.nextInt();
		}while (d<1||d>31);
		
		System.out.println("몇일 후?");
		h = sc.nextInt();
		
		now.set(y, m-1, d);
		x = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("만난날:" + y + "-" + m + "-" + d + "-" + yoil[x-1] + "요일");
	
		int year = now.get(Calendar.YEAR);//연도
		int month = now.get(Calendar.MONTH)+1;//월 (0~11) +1을해줌으로써 (1~12)를 보이게해줌
		int date = now.get(Calendar.DATE);//일
		int week = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7)값을 반환 1:일요일~7:토요일 손코딩은 0~6반환 캘린더 메소드는 1~7 반환
	
		System.out.println(h + "일후" + year + "-" + month + "-" + date + "-" + yoil[week-1] + "요일");
	}

}
