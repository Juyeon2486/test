package com.day15;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//������ �ð����� Ư�� �۾��� �ݺ��ؼ� �����Ҷ�

public class Test9 extends Thread{

	private int num;

	public Test9(){//�⺻������.

		TimerTask task = new TimerTask() {//������ Ŭ����

			@Override
			public void run() {
				//�ݺ� ������ �۾�
				num = 1;

			}
		};

		Timer t = new Timer();
		Calendar c = Calendar.getInstance();

		//���� 0�� 0�� 0�� ���� �Ϸ翡 �ѹ��� �ݺ�.
		/*c.add(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);//���� 1�ô� 13
		c.set(Calendar.MINUTE, 0);//0��
		c.set(Calendar.SECOND, 0);//0��
		c.set(Calendar.MILLISECOND, 0); //�и������� ���� ���־�� ��Ȯ�� 0��
		t.schedule(task, c.getTime(),1000*60*60*24);//�и�������*��*��*�ð� //��Ÿ������ ������ �������� 24�ð��� �ѹ��� ����
		 */

		t.schedule(task, 3000,5000);//getTime�� ����ð��� �������� 5�ʸ��� task�� �����϶� task�� num�� 1�� 5�ʸ��� �ʱ�ȭ.
	}

	@Override
	public void run() {

		while(true) {
			
			System.out.println(num++);//num=num+1 �� ���� num�� 1�̱⶧���� 2������ ������ 2���� 1�� ��������.

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
