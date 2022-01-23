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

public class ServerTest extends Frame implements ActionListener,Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null; //���� ���ϰ� ������ �η� �ʱ�ȭ.
	private Socket sc = null;
	
	public ServerTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);//tf������ �ᵵ�� 
		tf.addActionListener(this); //cctv
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setTitle("ä�ü���");
		setSize(300,400);
		setVisible(true);
	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777); //��Ʈ�� ���;��� �����. ��Ʈ��ȣ 7777�� �����Ѱ�
			ta.setText("��������!"); //������ ������Ѿ� ���Ʈ�� �����ϴ�.
			//cpu�� �����·� ����Ѵ�.
			sc = ss.accept();  //Ŭ���̾�Ʈ�� ������. ���Ʈ ���� �����.
			
			Thread th = new Thread(this);//���ڸ��� ���ʺ��� ����������� this�� ���ʺ��� �޾ұ⶧���� this�� ���ش�.
			th.start();//���ٸ� �޾ƿ�.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {// ������� ���� �������̵�
		new ServerTest().serverStart(); //��ü������ �� �ʿ���� �ι������ش�.

	}

	@Override
	public void run() {
		//�����͸� ������
		
		String str;
		String ip;
		
		try { //��Ʈ��ũ���� Ʈ����ĳġ���� ������ ���ش� ����ó���Ǿ����� �� �ֱ� ����
			
			if(sc==null)
				return;
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//br���� Ŭ���̾�Ʈ�� ���� ������ �������.
			//clientIP �˾Ƴ��¹�
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\r\n[" + ip + "] ����!!"); //ta�� ��� �����ؼ�
			
			while((str=br.readLine())!=null) {
				ta.append("\r\n" + str); // str�� �ѷ��ش�.
			}
			
		} catch (Exception e) {//Ŭ���̾�Ʈ�� ����Ǹ� ���ϰ� �������Ͽ� ���� �����Ⱚ���� �����ִ�.
			ta.append("\r\n Ŭ���̾�Ʈ ���� ����...");
			sc = null;
			ss = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//�����͸� ������ 
		
		String str = tf.getText();
		
		if(str.trim().equals("")) { //���ʿ� ������ ������ ���ֶ� trim  ���� ������ ���ְ� ���� ���̸� ����
			return;
		}
		
		if(sc==null) { //������ ������.
			return;
			
		}
		
		try {
			//OutputStream os = sc.getOutputStream() ��ǲ��Ʈ���� �ƿ�ǲ��Ʈ���� ¦. ���� �̷��� �����־��������
			//true:flush ���⼭ true�� flush�� ���� ��
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true); //������ is���� �ֱ⶧���� �ٷ� �����ش�.
			pw.println("����]" + str); //Ŭ���̾�Ʈ�� ����
			
			ta.append("\r\n����]:" + str); // �̰� ��â�� ���.
			
			tf.setText(""); //ä���Է�â�� �������� �ʱ�ȭ�ϰ� ������ ó���� �����.
			tf.requestFocus();
			
			
		} catch (Exception e2) {
			ta.append("\r\n Ŭ���̾�Ʈ�� ������ ������ϴ�.");
			sc = null;
			
		}
	}

}
