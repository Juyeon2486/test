package com.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener{

	private Button btn;
	private TextArea ta;
	private TextField tf;
	
	public Test4() {
		
		tf = new TextField();
		ta = new TextArea();
		btn = new Button("�߰�");
		
		add(tf,BorderLayout.NORTH); //�߰��ϴ°͵��� ���������� ���� �ܼ��ϴ�.
		add(ta,BorderLayout.CENTER);//�������̾ƿ��� �뽺 ���� ��콺 �̽�Ʈ ����Ʈ�� �ִ�. .
		add(btn,BorderLayout.SOUTH);
		
		tf.addActionListener(this); //tf�� �����ϱ����� ����ī�޶� this ������ �޾ƶ�.
		btn.addActionListener(this);//���͵��� btn�� �����ϱ�����.
		
		setTitle("������");
		setSize(500,500);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
		
		setVisible(true); //�����ְ� �ϱ����� �º�����. 
	}
	
	public static void main(String[] args) {

		new Test4();
		
		
		
	}

	@Override//�׼� �������� �޼ҵ� �׼� ����
	public void actionPerformed(ActionEvent evt) {//��ü�� ���� ������ �𸣱� ������ ������Ʈ�� �޾Ƴ���
		
		Object ob = evt.getSource();//avt�� �ִ� �ҽ��� �о�Ͷ�.
		
		if(ob instanceof Button|| ob instanceof TextField) {//ob�� ���� ������Ÿ���� ��ư or �ؽ�Ʈ�ʵ��? �� ���� ������
			
			String str = tf.getText(); //tf�� �ִ� �ؽ�Ʈ���� String���·� �о��
			
			if(!str.equals("")) { //�����̸� �Ʒ��������� �Ѿ��.
				
				ta.append(str + "\r\n");//����� = ������Ų��.
				
				tf.setText(""); //tf�� ���� ����־� �ʱ�ȭ ��Ŵ.
				tf.requestFocus(); //������Ʈ ��Ŀ��//�η� �ؽ�Ʈ �����ٳ������ ��.
			}
			
		}
		
		
		
	}

}
