package com.day15;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//정해진 시간마다 특정 작업을 반복해서 실행할때

public class Test9 extends Thread{

	private int num;

	public Test9(){//기본생성자.

		TimerTask task = new TimerTask() {//무명의 클래스

			@Override
			public void run() {
				//반복 실행할 작업
				num = 1;

			}
		};

		Timer t = new Timer();
		Calendar c = Calendar.getInstance();

		//내일 0시 0분 0초 부터 하루에 한번씩 반복.
		/*c.add(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);//오후 1시는 13
		c.set(Calendar.MINUTE, 0);//0분
		c.set(Calendar.SECOND, 0);//0초
		c.set(Calendar.MILLISECOND, 0); //밀리세컨드 까지 써주어야 정확한 0초
		t.schedule(task, c.getTime(),1000*60*60*24);//밀리세컨드*초*분*시간 //겟타임으로 가져온 순간부터 24시간에 한번씩 실행
		 */

		t.schedule(task, 3000,5000);//getTime이 현재시간을 가져오고 5초마다 task를 실행하라 task는 num을 1로 5초마다 초기화.
	}

	@Override
	public void run() {

		while(true) {
			
			System.out.println(num++);//num=num+1 로 쓰면 num이 1이기때문에 2가먼저 찍히고 2부터 1씩 더해진다.

			try {
				sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		
		new Test9().start();

	}

}
