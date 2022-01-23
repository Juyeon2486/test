package com.day17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//이벤트 단위의 프로그램
//윈도우즈 프로그램은 c#이나 nfc언어로 만든다. 빠름
//web은 이벤트다. 우리가 하는 행동 하나하나가 죄다 이벤트. 최소화 최대화 클릭 닫기 드래그 등등등
//AWT //웹이 이런 구조이기때문에 어떤식인지 알려주는용. 사용하진않는다.
//윈도우즈에선 form 자바에선 frame
public class Test1 extends Frame{
	
	private static final long serialVersionUID = 1L;

	public Test1() {
			
		setTitle("자바윈도우");
		setSize(200,300);
		setBackground(new Color(255, 0, 255)); //컴퓨터의 rgb컬러 레드 그린 블루 삼원색 0~255;
		
		//addWindowListener(new MyWindowAdapter()); //아래 클래스 마이윈도우어답터에서 기본생성자가 숨겨져있으므로 적어줌
		//아래 클로징만 감시하기 위해 클로징은 마이윈도우어답터클래스의 메소드. 클로징 실행시키기위해 경로지정해주는것.
		
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
