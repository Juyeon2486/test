package com.day17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame {
	
public Test3() {
		
		setTitle("자바윈도우");
		setSize(300, 300);
						
		//addWindowListener(new MyWindowAdapter()); 객체 생성.
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {//아래 클래스 마이윈도우어답터에서 기본생성자가 숨겨져있으므로 적어줌
				//아래 클로징만 감시하기 위해 클로징은 마이윈도우어답터클래스의 메소드. 클로징 실행시키기위해 경로지정해주는 것.
				System.exit(0);
			}
		});
		
		setVisible(true);
		
	}
	
	/*class MyWindowAdapter extends WindowAdapter	{//클래스 안에 클래스를 만들에 윈도우아답터를 상속받는방법,
	
	@Override
	public void windowClosing(WindowEvent arg0) {//소스에 오버라이드로 윈도우 아답터의 오버라이드를 볼수있다.
		System.exit(0);
		
	}
	}*/
	class MyWindowAdapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Test3();

	}

}