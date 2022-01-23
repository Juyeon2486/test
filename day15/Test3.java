package com.day15;

import java.util.Calendar;

class MyThread3 implements Runnable{

	@Override
	public void run() {
		 
		while(true) {			//인수를 하나가지고 나눠써라는 뜻 1$ F는 날짜 T는 시간.
			System.out.printf("%1$tF %1$tT\n",Calendar.getInstance());//캘린더로 시스템의 날짜와 시간을 출력.
												//getInstance 현재 시간을 읽어온다.
			try {
				Thread.sleep(1000);//1초마다
			} catch (Exception e) { 
			
			}
		}
		
	}
}

public class Test3 {

	public static void main(String[] args) {

		//현재 시스템의 날짜와 시간을 1초마다 출력하시오.
		
		Thread t = new Thread(new MyThread3());
		t.start();
		
	}

}
