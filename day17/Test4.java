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
		btn = new Button("추가");
		
		add(tf,BorderLayout.NORTH); //추가하는것들중 여러가지가 지만 단순하다.
		add(ta,BorderLayout.CENTER);//보더레이아웃은 노스 센터 사우스 이스트 웨스트가 있다. .
		add(btn,BorderLayout.SOUTH);
		
		tf.addActionListener(this); //tf를 감시하기위해 감시카메라를 this 나에게 달아라.
		btn.addActionListener(this);//위와동일 btn을 감시하기위해.
		
		setTitle("윈도우");
		setSize(500,500);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
			
		});
		
		setVisible(true); //보여주게 하기위해 셋비지블. 
	}
	
	public static void main(String[] args) {

		new Test4();
		
		
		
	}

	@Override//액션 리스너의 메소드 액션 퍼폼
	public void actionPerformed(ActionEvent evt) {//객체가 뭐가 들어올지 모르기 때문에 오브젝트로 받아낸다
		
		Object ob = evt.getSource();//avt에 있는 소스를 읽어와라.
		
		if(ob instanceof Button|| ob instanceof TextField) {//ob의 원래 데이터타입이 버튼 or 텍스트필드냐? 고 묻는 이프문
			
			String str = tf.getText(); //tf에 있는 텍스트값을 String형태로 읽어옴
			
			if(!str.equals("")) { //공백이면 아래문항으로 넘어가라.
				
				ta.append(str + "\r\n");//어펜드 = 누적시킨다.
				
				tf.setText(""); //tf에 널을 집어넣어 초기화 시킴.
				tf.requestFocus(); //리퀘스트 포커스//널로 텍스트 가져다놓으라는 뜻.
			}
			
		}
		
		
		
	}

}
