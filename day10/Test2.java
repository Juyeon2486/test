package com.day10;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		//Calendar now1 = new GregorianCalendar();
		
		int y = now.get(Calendar.YEAR);//����
		int m = now.get(Calendar.MONTH)+1;//�� (0~11) +1���������ν� (1~12)�� ���̰�����
		int d = now.get(Calendar.DATE);//��
		int w = now.get(Calendar.DAY_OF_WEEK);//���� ��(1~7)���� ��ȯ 1:�Ͽ���~7:����� ���ڵ��� 0~6��ȯ Ķ���� �޼ҵ�� 1~7 ��ȯ
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		//
		int startday = now.getActualMinimum(Calendar.DATE);
		int lastday = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startday + ":" + lastday);
		//�����ϰ� �������� ���� ���
		System.out.printf("%tF\n",now); //%tF�� ��¥�� ����ش�. 2022-01-04
		System.out.printf("%tT\n",now); //%tT�� �ð��� ����ش�. 11:51:04
		
		System.out.printf("%1$tF %1$tT\n",now); //%�ڿ� 1$�� ���ָ� �����̸��� ������ ������ڴٴ¶�.
		
		now.set(2022, 1-1, 24);//get������ 0~11�̴� +1�����ְ� 
								//set������ ����ڰ����� 1~12�̴� -1�� ���־����.
		
		y = now.get(Calendar.YEAR);//����
		m = now.get(Calendar.MONTH)+1;//�� (0~11) +1���������ν� (1~12)�� ���̰�����
		d = now.get(Calendar.DATE);//��
		w = now.get(Calendar.DAY_OF_WEEK);//���� ��(1~7)���� ��ȯ 1:�Ͽ���~7:����� ���ڵ��� 0~6��ȯ Ķ���� �޼ҵ�� 1~7 ��ȯ
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
	}

}
