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
		setVisible(true);//기본적인 창을 만듬.
	}
	public static void main(String[] args) {

		new Test5();
	}

	@Override//액션리스너의 오버라이딩
	public void actionPerformed(ActionEvent e) {
		//http 하이퍼 텍스트 트랜스퍼 프로토콜
		try {
			
			String str;
			URL url = new URL(tf.getText());//URL 형식을 받는 클래스 URL엔 http가 들어있어야함.
			 
			ta.setText(""); //데이터를 넣기전 초기화
			
			//방법1 //오픈스트림= 이 URL 에의 접속을 오픈해, 그 접속으로부터 read를 행하기 위한 InputStream 를 돌려줍니다.
			//InputStream is = url.openStream(); //위 URL로 찾아가서 초기화하고 is에 담아라.
			//필요한곳에 빨대를 꽂아 흘러나오는 물을 is에 담아둔다 그런 개념
			
			//방법2  // 
			URLConnection conn = url.openConnection(); // 고급지게? 들어감 원리는 똑같음//정중하게 연결하겠다.이런뜻?
			InputStream is = conn.getInputStream(); // 빨대를꽂음.
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));//2바이트로 받아서 br에 담아둠.
			
			while((str=br.readLine())!=null) { //리드라인이 한줄씩 읽어옴 
				
				if(ta.getText().equals(""))
					ta.setText(str);
				else
					ta.setText(ta.getText()+ "\n\r" + str);
			}			//괄호안의 값을 줄바꿔서 다시 넣어라.
			is.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

}
