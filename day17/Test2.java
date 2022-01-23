package com.day17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2 extends Frame implements WindowListener{ //자바는 단일상속이기때문에 인터페이스를 많이쓴다. 
	//인터페이스는 다중 구현이 되기때문. ,를 써서 여러가지의 인터페이스를 사용가능.
	
	private static final long serialVersionUID = 1L;

	public Test2() {//변해가는 모습을 보여줌. Test1~7
		
		setTitle("자바윈도우");
		setSize(300,300);
		
		addWindowListener(this); //사용자가 무엇을 하는지 감시하는 cctv? (괄호엔 Test2 = this) ;자기자신에게 감시해라.
		//윈도우즈창에 감시자를 추가한것.
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Test2();
	}

	@Override
	public void windowActivated(WindowEvent e) { //창을 앞으로 옴기고 뒤로 옴기고. 엑티베이트. 
	}

	@Override
	public void windowClosed(WindowEvent e) { // 창닫기 완전히 종료// 후에 작업?
	}

	@Override
	public void windowClosing(WindowEvent e) {//종료하기전에 작업 클로징
		System.exit(0);
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) { // 엑티베이트 했을때 뒤로 옴겨지는 창 디엑티베이트.
	}

	@Override
	public void windowDeiconified(WindowEvent e) { //최대화
	}

	@Override
	public void windowIconified(WindowEvent e) { // 최소화
	}

	@Override
	public void windowOpened(WindowEvent e) {// 창이 처음 열릴때 어떤걸 하겠다.
	}

}
