package com.day10;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		//Calendar now1 = new GregorianCalendar();
		
		int y = now.get(Calendar.YEAR);//연도
		int m = now.get(Calendar.MONTH)+1;//월 (0~11) +1을해줌으로써 (1~12)를 보이게해줌
		int d = now.get(Calendar.DATE);//일
		int w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7)값을 반환 1:일요일~7:토요일 손코딩은 0~6반환 캘린더 메소드는 1~7 반환
		
		String[] week = {"일","월","화","수","목","금","토"};
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		//
		int startday = now.getActualMinimum(Calendar.DATE);
		int lastday = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startday + ":" + lastday);
		//시작일과 마지막일 수를 계산
		System.out.printf("%tF\n",now); //%tF가 날짜를 찍어준다. 2022-01-04
		System.out.printf("%tT\n",now); //%tT가 시간을 찍어준다. 11:51:04
		
		System.out.printf("%1$tF %1$tT\n",now); //%뒤에 1$를 써주면 같은이름의 변수를 나누어쓰겠다는뜻.
		
		now.set(2022, 1-1, 24);//get을쓸땐 0~11이니 +1을해주고 
								//set을쓸땐 사용자가보는 1~12이니 -1을 해주어야함.
		
		y = now.get(Calendar.YEAR);//연도
		m = now.get(Calendar.MONTH)+1;//월 (0~11) +1을해줌으로써 (1~12)를 보이게해줌
		d = now.get(Calendar.DATE);//일
		w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7)값을 반환 1:일요일~7:토요일 손코딩은 0~6반환 캘린더 메소드는 1~7 반환
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
	}

}
