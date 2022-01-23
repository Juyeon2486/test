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
import java.net.URL;
import java.net.URLConnection;

public class Test5 extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private TextArea ta;
	private TextField tf;
	
	public Test5() {
		
		ta = new TextArea();
		add(ta);
		
		tf = new TextField();
		tf.addActionListener(this);
		add(tf,BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				
			}
		});
		
		setTitle("HTML Viewer");
		setSize(400,300);
		setVisible(true);//�⺻���� â�� ����.
	}
	public static void main(String[] args) {

		new Test5();
	}

	@Override//�׼Ǹ������� �������̵�
	public void actionPerformed(ActionEvent e) {
		//http ������ �ؽ�Ʈ Ʈ������ ��������
		try {
			
			String str;
			URL url = new URL(tf.getText());//URL ������ �޴� Ŭ���� URL�� http�� ����־����.
			 
			ta.setText(""); //�����͸� �ֱ��� �ʱ�ȭ
			
			//���1 //���½�Ʈ��= �� URL ���� ������ ������, �� �������κ��� read�� ���ϱ� ���� InputStream �� �����ݴϴ�.
			//InputStream is = url.openStream(); //�� URL�� ã�ư��� �ʱ�ȭ�ϰ� is�� ��ƶ�.
			//�ʿ��Ѱ��� ���븦 �Ⱦ� �귯������ ���� is�� ��Ƶд� �׷� ����
			
			//���2  // 
			URLConnection conn = url.openConnection(); // �������? �� ������ �Ȱ���//�����ϰ� �����ϰڴ�.�̷���?
			InputStream is = conn.getInputStream(); // ���븦����.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));//2����Ʈ�� �޾Ƽ� br�� ��Ƶ�.
			
			while((str=br.readLine())!=null) { //��������� ���پ� �о�� 
				
				if(ta.getText().equals(""))
					ta.setText(str);
				else
					ta.setText(ta.getText()+ "\n\r" + str);
			}			//��ȣ���� ���� �ٹٲ㼭 �ٽ� �־��.
			is.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

}
