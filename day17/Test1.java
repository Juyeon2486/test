package com.day17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//�̺�Ʈ ������ ���α׷�
//�������� ���α׷��� c#�̳� nfc���� �����. ����
//web�� �̺�Ʈ��. �츮�� �ϴ� �ൿ �ϳ��ϳ��� �˴� �̺�Ʈ. �ּ�ȭ �ִ�ȭ Ŭ�� �ݱ� �巡�� ����
//AWT //���� �̷� �����̱⶧���� ������� �˷��ִ¿�. ��������ʴ´�.
//��������� form �ڹٿ��� frame
public class Test1 extends Frame{
	
	private static final long serialVersionUID = 1L;

	public Test1() {
			
		setTitle("�ڹ�������");
		setSize(200,300);
		setBackground(new Color(255, 0, 255)); //��ǻ���� rgb�÷� ���� �׸� ��� ����� 0~255;
		
		//addWindowListener(new MyWindowAdapter()); //�Ʒ� Ŭ���� �������������Ϳ��� �⺻�����ڰ� �����������Ƿ� ������
		//�Ʒ� Ŭ��¡�� �����ϱ� ���� Ŭ��¡�� ��������������Ŭ������ �޼ҵ�. Ŭ��¡ �����Ű������ ����������ִ°�.
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Test1();
	}

}
