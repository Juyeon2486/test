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

	private TextArea ta = new TextArea(); //1대다수 채팅이 되려면 다수인원만큼의 스레드가 필요하다.
	private TextField tf = new TextField();
	//서버 소켓과 소켓은 널로 초기화.
	private Socket sc = null;
	private String host = "127.0.0.1"; //localhost //클래스에서 this와 같은의미 아이피가바뀌어도 자기 아이피가 들어감.
	//127.0.0.1 과 localhost는 같은맥락 루프백이라고 함
	private int port = 7777; //서버 포트를 7777로 만들었기에 //0~65535 까지 있다 포트번호. 넉넉히2~3천번대 포트는 시스템이 사용.
	
	
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
		
		setTitle("채팅클라이언트");
		setSize(300,400);
		setVisible(true);
	}
	
	public void connect() {
		
		try {
			//클라이언트는 바로 서버를 찾아가면 된다.
			sc = new Socket(host, port); //호스트와 포트로 소켓을 만듬.
			
			Thread th = new Thread(this);//디스자리에 러너블을 적어야하지만 this가 러너블을 받았기때문에 this를 써준다.
			th.start();//수다를 스레드가 받는다.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {// 스레드는 런을 오버라이드
		new ClientTest().connect(); //객체생성을 할 필요없이 두번적어준다.

	}

	@Override
	public void run() {
		//데이터를 받을때
		
		String str;
		
		try { //네트워크에는 트라이캐치문을 무조건 써준다 예외처리되어있을 수 있기 때문
			
			if(sc==null)
				return;
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//br에는 클라이언트가 보낸 정보가 담겨있음.
			
			while((str=br.readLine())!=null) {
				ta.append("\r\n" + str); // str에 뿌려준다.
			}
			
		} catch (Exception e) {//클라이언트가 종료되면 소켓과 서버소켓에 값이 쓰레기값으로 남아있다.
			ta.append("\r\n 서버 연결 종료...");
			sc = null;
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//데이터를 보낼때 
		
		String str = tf.getText();
		
		if(str.trim().equals("")) { //양쪽에 공백이 있으면 없애라 trim  양쪽 공백을 없애고도 값이 널이면 종료
			return;
		}
		
		if(sc==null) {
			return;
			
		}
		
		try {
			//OutputStream os = sc.getOutputStream() 인풋스트림과 아웃풋스트림은 짝. 원래 이렇게 적어주어야하지만
			//true:flush 여기서 true는 flush와 같은 뜻
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true); //위에서 is값에 넣기때문에 바로 적어준다.
			pw.println("클라이언트]" + str); //클라이언트에 전송
			
			ta.append("\r\n클라이언트]:" + str); // 이건 내창에 띄움.
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			ta.append("\r\n 서버와 접속이 끊겼습니다.");
			sc = null;
			
		}
	}

}
