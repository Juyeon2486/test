package com.day17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2 extends Frame implements WindowListener{ //�ڹٴ� ���ϻ���̱⶧���� �������̽��� ���̾���. 
	//�������̽��� ���� ������ �Ǳ⶧��. ,�� �Ἥ ���������� �������̽��� ��밡��.
	
	private static final long serialVersionUID = 1L;

	public Test2() {//���ذ��� ����� ������. Test1~7
		
		setTitle("�ڹ�������");
		setSize(300,300);
		
		addWindowListener(this); //����ڰ� ������ �ϴ��� �����ϴ� cctv? (��ȣ�� Test2 = this) ;�ڱ��ڽſ��� �����ض�.
		//��������â�� �����ڸ� �߰��Ѱ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Test2();
	}

	@Override
	public void windowActivated(WindowEvent e) { //â�� ������ �ȱ�� �ڷ� �ȱ��. ��Ƽ����Ʈ. 
	}

	@Override
	public void windowClosed(WindowEvent e) { // â�ݱ� ������ ����// �Ŀ� �۾�?
	}

	@Override
	public void windowClosing(WindowEvent e) {//�����ϱ����� �۾� Ŭ��¡
		System.exit(0);
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) { // ��Ƽ����Ʈ ������ �ڷ� �Ȱ����� â ��Ƽ����Ʈ.
	}

	@Override
	public void windowDeiconified(WindowEvent e) { //�ִ�ȭ
	}

	@Override
	public void windowIconified(WindowEvent e) { // �ּ�ȭ
	}

	@Override
	public void windowOpened(WindowEvent e) {// â�� ó�� ������ ��� �ϰڴ�.
	}

}
