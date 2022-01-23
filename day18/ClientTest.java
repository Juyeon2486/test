package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest extends Frame implements ActionListener,Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea(); //1��ټ� ä���� �Ƿ��� �ټ��ο���ŭ�� �����尡 �ʿ��ϴ�.
	private TextField tf = new TextField();
	//���� ���ϰ� ������ �η� �ʱ�ȭ.
	private Socket sc = null;
	private String host = "127.0.0.1"; //localhost //Ŭ�������� this�� �����ǹ� �����ǰ��ٲ� �ڱ� �����ǰ� ��.
	//127.0.0.1 �� localhost�� �����ƶ� �������̶�� ��
	private int port = 7777; //���� ��Ʈ�� 7777�� ������⿡ //0~65535 ���� �ִ� ��Ʈ��ȣ. �˳���2~3õ���� ��Ʈ�� �ý����� ���.
	
	
	public ClientTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this); //cctv
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setTitle("ä��Ŭ���̾�Ʈ");
		setSize(300,400);
		setVisible(true);
	}
	
	public void connect() {
		
		try {
			//Ŭ���̾�Ʈ�� �ٷ� ������ ã�ư��� �ȴ�.
			sc = new Socket(host, port); //ȣ��Ʈ�� ��Ʈ�� ������ ����.
			
			Thread th = new Thread(this);//���ڸ��� ���ʺ��� ����������� this�� ���ʺ��� �޾ұ⶧���� this�� ���ش�.
			th.start();//���ٸ� �����尡 �޴´�.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {// ������� ���� �������̵�
		new ClientTest().connect(); //��ü������ �� �ʿ���� �ι������ش�.

	}

	@Override
	public void run() {
		//�����͸� ������
		
		String str;
		
		try { //��Ʈ��ũ���� Ʈ����ĳġ���� ������ ���ش� ����ó���Ǿ����� �� �ֱ� ����
			
			if(sc==null)
				return;
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//br���� Ŭ���̾�Ʈ�� ���� ������ �������.
			
			while((str=br.readLine())!=null) {
				ta.append("\r\n" + str); // str�� �ѷ��ش�.
			}
			
		} catch (Exception e) {//Ŭ���̾�Ʈ�� ����Ǹ� ���ϰ� �������Ͽ� ���� �����Ⱚ���� �����ִ�.
			ta.append("\r\n ���� ���� ����...");
			sc = null;
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//�����͸� ������ 
		
		String str = tf.getText();
		
		if(str.trim().equals("")) { //���ʿ� ������ ������ ���ֶ� trim  ���� ������ ���ְ� ���� ���̸� ����
			return;
		}
		
		if(sc==null) {
			return;
			
		}
		
		try {
			//OutputStream os = sc.getOutputStream() ��ǲ��Ʈ���� �ƿ�ǲ��Ʈ���� ¦. ���� �̷��� �����־��������
			//true:flush ���⼭ true�� flush�� ���� ��
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true); //������ is���� �ֱ⶧���� �ٷ� �����ش�.
			pw.println("Ŭ���̾�Ʈ]" + str); //Ŭ���̾�Ʈ�� ����
			
			ta.append("\r\nŬ���̾�Ʈ]:" + str); // �̰� ��â�� ���.
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			ta.append("\r\n ������ ������ ������ϴ�.");
			sc = null;
			
		}
	}

}
